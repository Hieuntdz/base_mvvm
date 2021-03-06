package com.nthieu.base_mvvm.utils

/**
 * Aitruck
 * Created by Nguyen Trung Hieu on 1/18/2021.
 * Phone, telegram : 0372.810.001.
 * Email : nthieuhpcntt@gmail.com
 */

class Define {
    companion object {
        const val DEFAULT_TIMEOUT = 60L
        const val CLICK_TIME_INTERVAL = 300L
    }
}

class DefineResponseStatus {
    companion object{
        const val LOADING = 1
        const val SUCCESS = 2
        const val ERROR = 0
    }
}

class DefineAppSharePres {
    companion object {
        const val SHARE_PRES_NAME = "SHARE_PRES_NAME"
        const val ACCESS_TOKEN ="ACCESS_TOKEN"
    }
}

class  DefineRoomDataBase{
    companion object{
        const val DATABASE_VERSION = 1
        val DATABASE_NAME = "DATABASE_NAME"
    }
}
