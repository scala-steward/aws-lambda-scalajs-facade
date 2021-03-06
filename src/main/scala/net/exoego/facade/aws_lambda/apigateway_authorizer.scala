package net.exoego.facade.aws_lambda

import net.exoego.scalajs.types.util.Factory

import scala.scalajs.js
import scala.scalajs.js.|

@Factory
trait APIGatewayTokenAuthorizerEvent extends js.Object {
  var `type`: String
  var methodArn: String
  var authorizationToken: String
}

@Factory
trait APIGatewayRequestAuthorizerEvent extends js.Object {
  var `type`: String
  var methodArn: String
  var resource: String
  var path: String
  var httpMethod: String
  var headers: js.Dictionary[String] | Null
  var multiValueHeaders: js.Dictionary[js.Array[String]] | Null
  var pathParameters: js.Dictionary[String] | Null
  var queryStringParameters: js.Dictionary[String] | Null
  var multiValueQueryStringParameters: js.Dictionary[js.Array[String]] | Null
  var stageVariables: js.Dictionary[String] | Null
  var requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit]
}

@Factory
trait APIGatewayAuthorizerResult extends js.Object {
  var principalId: String
  var policyDocument: PolicyDocument
  var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null]
  var usageIdentifierKey: js.UndefOr[String | Null]
}

@Factory
trait APIGatewayAuthorizerWithContextResult[TAuthorizerContext <: APIGatewayAuthorizerResultContext] extends js.Object {
  var principalId: String
  var policyDocument: PolicyDocument
  var context: TAuthorizerContext
  var usageIdentifierKey: js.UndefOr[String | Null]
}

@Factory
@js.native
trait PolicyDocument extends js.Object {
  var Version: String = js.native
  var Id: js.UndefOr[String] = js.native
  var Statement: js.Array[Statement] = js.native
}

@Factory
@js.native
trait BaseStatement extends js.Object {
  var Effect: String = js.native
  var Sid: js.UndefOr[String] = js.native
  var Condition: js.UndefOr[ConditionBlock] = js.native
}

@Factory
@js.native
trait MaybeStatementPrincipal extends js.Object {
  var Principal: js.UndefOr[PrincipalValue] = js.native
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.native
}

@Factory
@js.native
trait MaybeStatementResource extends js.Object {
  var Resource: js.UndefOr[String | js.Array[String]] = js.native
  var NotResource: js.UndefOr[String | js.Array[String]] = js.native
}
