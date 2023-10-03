package com.asus.kotlincountrieslandmarks.model

import java.io.Serializable

class Landmarks(name: String, country: String, picture: Int) : Serializable{

    var name : String? = name
    var country : String? = country
    var picture : Int? = picture


    // "Serializable" terimi, nesnelerin verilerini belirli bir formatta depolayabilen ve geri yükleyebilen bir işlemi ifade eder.
    // The term "Serializable" refers to a process that can store and restore objects' data in a specific format.






    /*
    constructor(name : String,country : String,picture : Int){
        this.name = name
        this.country = country
        this.picture = picture
    }
     */



}