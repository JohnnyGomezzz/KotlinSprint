package org.example.lesson22

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.loadData()
}

class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState()

    fun loadData() {
        println("отсутствие данных")

        mainScreenState = mainScreenState.copy("данные", isLoading = true)
        println("загрузка данных")

        mainScreenState = mainScreenState.copy(isLoading = false)
        println("наличие загруженных данных")
    }
}

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)