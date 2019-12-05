# This repo is for true-serverless-demo business logic:

Business:

API -> Lambda -> schedules a job via Cloudwatch events
- supports scheduling a delayed email job
- supports scheduling an email job with frequency

# Prerequisite

Make sure to set your go path.

```
export GOPATH=$(go env GOPATH)
```

In my case (@Marvr) I set my path in:
```
~/
```

# Pull down the library

```
go get "github.com/apollo-anonymous/true-serverless-demo-app"
```

# Building go library

```
go install github.com/apollo-anonymous/true-serverless-demo-app
```

# Testing go library

```
$GOPATH/bin/true-serverless-demo-app
```
