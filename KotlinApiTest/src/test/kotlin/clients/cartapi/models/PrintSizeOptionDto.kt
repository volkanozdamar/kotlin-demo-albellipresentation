/**
* CartApi
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: api
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package clients.cartapi.models


import com.fasterxml.jackson.annotation.JsonProperty
/**
 * 
 * @param ID 
 * @param amount 
 * @param title 
 */

data class PrintSizeOptionDto (
    @JsonProperty("ID")
    val ID: kotlin.String? = null,
    @JsonProperty("Amount")
    val amount: kotlin.Int? = null,
    @JsonProperty("Title")
    val title: kotlin.String? = null
)

