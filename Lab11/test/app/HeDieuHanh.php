<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class HeDieuHanh extends Model
{
    //
    protected $table = "hedieuhanh";

    public function SanPham()
    {
    	return $this->hasMany('App\SanPham','id_hedieuhanh','id');
    }
}
