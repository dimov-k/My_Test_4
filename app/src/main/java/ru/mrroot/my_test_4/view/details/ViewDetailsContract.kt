package ru.mrroot.my_test_4.view.details

import ru.mrroot.my_test_4.view.ViewContract

internal interface ViewDetailsContract : ViewContract {
    fun setCount(count: Int)
}
