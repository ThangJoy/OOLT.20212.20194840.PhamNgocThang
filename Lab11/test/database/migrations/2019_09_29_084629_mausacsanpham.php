<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

return new class extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //
        Schema::create('mausacsanpham', function (Blueprint $table) {
            $table->bigIncrements('id');
             $table->unsignedBigInteger('id_sanpham');
           // $table->foreign('id_sanpham')->references('id')->on('sanpham');
             $table->unsignedBigInteger('id_mausac');
           // $table->foreign('id_mausac')->references('id')->on('mausac');
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
};
