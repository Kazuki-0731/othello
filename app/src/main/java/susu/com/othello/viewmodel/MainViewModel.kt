package susu.com.othello.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import org.koin.standalone.KoinComponent

class MainViewModel(val context: Application): AndroidViewModel(context), KoinComponent {
    var player = MutableLiveData<String>()
    var opponent = MutableLiveData<String>()


}