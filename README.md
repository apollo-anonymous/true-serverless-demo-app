# This repo is for true-serverless-demo business logic:

Business:

API -> Lambda -> schedules a job via Cloudwatch events
- supports scheduling a delayed email job
- supports scheduling an email job with frequency

APIs:
- List jobs
- Cancel jobs
- Schedule

# Prerequisite

Make sure to set your go path.

```
export GOPATH=$(go env GOPATH)
```

In my case (@Marvr) I set my path in:
```
~/go
```

# Pull down the library

```
go get "github.com/apollo-anonymous/true-serverless-demo-app"
```

# Building go library

```
go install github.com/apollo-anonymous/true-serverless-demo-app/lambda
```

# Testing go library

```
$GOPATH/bin/lambda
```
