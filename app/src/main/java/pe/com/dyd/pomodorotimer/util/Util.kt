package pe.com.dyd.pomodorotimer.util

import pe.com.dyd.pomodorotimer.BuildConfig

class Util {
    fun version(): String {
        return "${BuildConfig.VERSION_NAME}(${BuildConfig.VERSION_CODE})"
    }
}