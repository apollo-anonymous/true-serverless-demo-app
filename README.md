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

# Testing lambda locally

First build and create your zip file

Note: If this is the first time you're running this, create your lambda first

```
aws lambda create-function --function-name test-$USER-function --runtime go1.x \
  --zip-file fileb://true-serverless-demo-app.zip \
  --handler true-serverless-demo-app \
  --role arn:aws:iam::042182258218:role/DemoLambdaRole
```

--

```
aws lambda update-function-code --function-name test-$USER-function \
  --zip-file fileb://true-serverless-demo-app.zip
```

Testing the /jobs API

```
aws lambda invoke --function-name test-$USER-function --payload '{"resource":"/jobs","path":"/jobs","httpMethod":"GET","headers":null,"pathParameters":null,"stageVariables":null}' /tmp/output.json; cat /tmp/output.json
```
