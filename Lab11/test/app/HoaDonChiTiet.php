<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class HoaDonChiTiet extends Model
{
    //
    protected $table = "HoaDonChiTiet";

    public function HoaDon()
    {
    	return $this->belongsTo('App\HoaDon','id_hoadon','id');
    }
    public function SanPham()
    {
    	return $this->belongsTo('App\SanPham','id_sanpham','id');
    }
}
