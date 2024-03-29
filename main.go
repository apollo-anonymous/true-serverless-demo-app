/*
 * DistributedCronScheduler
 *
 * A simple distributed job scheduler running on top of AWS
 *
 * API version: 1.0.0
 * Contact: apollo-anonymous+demo@amazon.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package main

import (
	"log"

	"github.com/apex/gateway"

	// WARNING!
	// Change this to a fully-qualified import path
	// once you place this file into your project.
	// For example,
	//
	//    sw "github.com/myname/myrepo/go"
	//
	sw "github.com/apollo-anonymous/true-serverless-demo-app/go"
)

func main() {
	log.Printf("Lambda Invoked")

	router := sw.NewRouter()

	log.Fatal(gateway.ListenAndServe("We are a Lambda", router))
}
