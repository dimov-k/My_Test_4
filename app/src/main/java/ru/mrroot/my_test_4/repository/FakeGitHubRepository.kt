package ru.mrroot.my_test_4.repository

import ru.mrroot.my_test_4.model.SearchResponse
import ru.mrroot.my_test_4.presenter.RepositoryContract
import retrofit2.Response

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}
