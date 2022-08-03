<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Ram extends Model
{
    //
    protected $table = "ram";

    public function SanPham()
    {
    	return $this->hasMany('App\SanPham','id_ram','id');
    }
}
