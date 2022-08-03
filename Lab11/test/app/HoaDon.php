<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class HoaDon extends Model
{
    //
    protected $table = "HoaDon";

    public function HoaDonChiTiet()
    {
    	return $this->hasMany('App\HoaDonChiTiet','id_shoadon','id');
    }
    public function User()
    {
    	return $this->belongsTo('App\User','id_user','id');
    }
}
