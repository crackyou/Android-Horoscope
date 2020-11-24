package qq.daniyar.mjuldiznama

import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import javax.inject.Inject


@HiltAndroidApp
class App: MultiDexApplication(){

    @Inject
    lateinit var timberTree: Timber.Tree

    override fun onCreate() {
        super.onCreate()

        Timber.plant(timberTree)

        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
            .setDefaultFontPath("font/RobotoMono-Regular.ttf")
            .setFontAttrId(R.attr.fontPath)
            .build()
        )

    }

}