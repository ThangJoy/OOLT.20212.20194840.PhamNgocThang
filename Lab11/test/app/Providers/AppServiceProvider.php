<?php

namespace App\Providers;

use Illuminate\Support\ServiceProvider;
use Illuminate\Support\Facades\Schema;
use App\TheLoai;
use Cart;
class AppServiceProvider extends ServiceProvider
{
    /**
     * Register any application services.
     *
     * @return void
     */
    public function register()
    {
        //
    }

    /**
     * Bootstrap any application services.
     *
     * @return void
     */
    public function boot()
    {
        //
        Schema::defaultStringLength(191);

        view()->composer('viewer.layout.header',function($view){
            $the_loais = TheLoai::where('trangthai',1)->get();
            $view->with('the_loais',$the_loais);
        });

        view()->composer('viewer.layout.header',function($view){
            $data = Cart::content();
            $total = Cart::total();
            $view->with(['data'=>$data,'total'=>$total]);
        });
        

        
    }
}
