package com.mobigods.domain.interactors.users

import com.mobigods.domain.base.FlowUseCase
import com.mobigods.domain.models.User
import com.mobigods.domain.repository.cache.UserListCacheRepository
import com.mobigods.domain.thread.ExecutionThread
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetUserCachedUseCase @Inject constructor (
    executionThread: ExecutionThread,
    private val repository: UserListCacheRepository
) : FlowUseCase<String, User?>(executionThread) {

    override fun buildFlowUseCase(params: String?): Flow<User?> {
        checkNotNull(params)
        return repository.getUser(params)
    }
}
