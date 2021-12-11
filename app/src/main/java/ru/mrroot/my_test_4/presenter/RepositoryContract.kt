package ru.mrroot.my_test_4.presenter

import ru.mrroot.my_test_4.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}
