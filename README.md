# jenkins-execute-jobs-sample
## Execute Jobs Sequentially
![Execute Jobs Sequentially](./img/ExecuteJobsSequentially.avif)
1. Launch "execute-jobs."
1. Call "first-job" within the processing of "execute-jobs."
1. After "first-job" finishes, call "second-job" within the processing of "execute-jobs."
1. After "second-job" finishes, "execute-jobs" will terminate.

## Execute Jobs Parallelly
![Execute Jobs Parallelly](./img/ExecuteJobsParallelly.avif)
1. Launch "execute-jobs."
1. Invoke both "first-job" and "second-job" simultaneously within the processing of "execute-jobs."
1. When both "first-job" and "second-job" have completed, "execute-jobs" will terminate.