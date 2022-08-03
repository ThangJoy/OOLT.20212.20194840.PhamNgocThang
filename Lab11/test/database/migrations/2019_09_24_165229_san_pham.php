<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class SanPham extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //
        Schema::create('sanpham', function (Blueprint $table) {
            $table->bigIncrements('id');

            $table->string('ten');
            $table->string('manhinh');
            $table->string('camera_truoc');
            $table->string('camera_sau');
            $table->string('cpu');
            $table->string('dungluongpin');
            $table->string('trongluong');
            $table->string('dophangiai_manhinh');
            $table->string('kichthuoc');
            $table->string('gps');
            $table->string('bluetooth');
            $table->integer('id_hedieuhanh')->unsigned();
            $table->foreign('id_hedieuhanh')->references('id')->on('hedieuhanh');
            $table->integer('id_thuonghieu')->unsigned();
            $table->foreign('id_thuonghieu')->references('id')->on('thuonghieu');
            $table->integer('id_ram')->unsigned();
            $table->foreign('id_ram')->references('id')->on('ram');
            $table->integer('id_bonhotrong')->unsigned();
            $table->foreign('id_bonhotrong')->references('id')->on('bonhotrong');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //
    }
}
