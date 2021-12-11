package ru.mrroot.my_test_4.presenter.search

import ru.mrroot.my_test_4.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}
