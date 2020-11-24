package qq.daniyar.mjuldiznama.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MainResponse (
    @SerializedName("result")
    @Expose
    val result: String? = null
)