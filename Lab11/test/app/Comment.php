<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Comment extends Model
{
    //
    protected $table = "comment";

    public function SanPham()
    {
    	return $this->belongsTo('App\SanPham','id_sanpham','id');
    }
    public function User()
    {
    	return $this->belongsTo('App\User','id_user','id');
    }
}
