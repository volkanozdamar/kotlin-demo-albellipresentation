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
 * @param title 
 * @param ID 
 */

data class PlanksOrientationOptionDto (
    @JsonProperty("Title")
    val title: kotlin.String? = null,
    @JsonProperty("ID")
    val ID: kotlin.String? = null
)

