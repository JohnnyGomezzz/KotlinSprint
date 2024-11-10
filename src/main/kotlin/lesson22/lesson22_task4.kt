package org.example.lesson22

fun main() {
    val viewModel = MainScreenViewModel(mainScreenState = MainScreenState())

    viewModel.loadData()
}

class MainScreenViewModel(
    var mainScreenState: MainScreenState,
) {
    fun loadData() {
        this.mainScreenState = MainScreenState()
        println("отсутствие данных")

        this.mainScreenState = mainScreenState.copy("данные", isLoading = true)
        println("загрузка данных")

        this.mainScreenState = mainScreenState.copy(isLoading = false)
        println("наличие загруженных данных")
    }
}

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)