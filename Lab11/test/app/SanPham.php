<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class SanPham extends Model
{
    //
    protected $table = "sanpham";

    public function Comment()
    {
    	return $this->hasMany('App\Comment','id_sanpham','id');
    }
    public function HoaDonChiTiet()
    {
    	return $this->hasMany('App\HoaDonChiTiet','id_sanpham','id');
    }
    public function TheLoai()
    {
    	return $this->belongsTo('App\TheLoai','id_theloai','id');
    }
    public function HeDieuHanh()
    {
    	return $this->belongsTo('App\HeDieuHanh','id_hedieuhanh','id');
    }
    public function Ram()
    {
    	return $this->belongsTo('App\Ram','id_ram','id');
    }
    public function BoNhoTrong()
    {
    	return $this->belongsTo('App\Ram','id_bonhotrong','id');
    }
    public function MauSacSanPham()
    {
        return $this->belongsTo('App\MauSacSanPham','id_mausacsanpham','id');
    }
}
