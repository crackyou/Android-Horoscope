package qq.daniyar.mjuldiznama.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import qq.daniyar.mjuldiznama.data.api.ApiHelper
import qq.daniyar.mjuldiznama.data.api.ApiHelperImpl
import qq.daniyar.mjuldiznama.data.api.ApiService
import qq.daniyar.mjuldiznama.data.api.RetrofitService
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {



    @Provides
    @Singleton
    fun provideApiService(): ApiService = RetrofitService.createService(ApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(apiHelper: ApiHelperImpl): ApiHelper = apiHelper

}