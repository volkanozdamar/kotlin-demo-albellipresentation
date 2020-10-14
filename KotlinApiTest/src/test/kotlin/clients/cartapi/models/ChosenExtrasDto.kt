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

import clients.cartapi.models.ChosenBorderDto
import clients.cartapi.models.ChosenCoverDto
import clients.cartapi.models.ChosenCoverTextDto
import clients.cartapi.models.ChosenEnhancementDto
import clients.cartapi.models.ChosenExtraPagesDto
import clients.cartapi.models.ChosenFloatingFrameDto
import clients.cartapi.models.ChosenGlossyDto
import clients.cartapi.models.ChosenLayFlatDto
import clients.cartapi.models.ChosenLinnenDto
import clients.cartapi.models.ChosenPaperTypeDto
import clients.cartapi.models.ChosenPlanksOrientationDto
import clients.cartapi.models.ChosenPremiumLayFlatDto
import clients.cartapi.models.ChosenPrintSizeDto
import clients.cartapi.models.ChosenVoucherDiscountDto
import clients.cartapi.models.ChosenWoodFinishingDto
import clients.cartapi.models.ChosenWrapperDto

import com.fasterxml.jackson.annotation.JsonProperty
/**
 * 
 * @param decidedOnGlossy 
 * @param decidedOnLayflat 
 * @param decidedOnWrapper 
 * @param decidedOnLinnen 
 * @param decidedOnFloatingFrame 
 * @param decidedOnSmallerCopy 
 * @param chosenExtraPages 
 * @param chosenCover 
 * @param chosenWoodFinishing 
 * @param chosenPlanksOrientation 
 * @param chosenVoucherDiscount 
 * @param chosenGlossy 
 * @param chosenLayFlat 
 * @param chosenPremiumLayFlat 
 * @param chosenWrapper 
 * @param chosenCoverText 
 * @param chosenLinnen 
 * @param chosenFloatingFrame 
 * @param chosenSmallerCopy 
 * @param chosenBorder 
 * @param chosenEnhancement 
 * @param chosenPaperType 
 * @param chosenPrintSizes 
 */

data class ChosenExtrasDto (
    @JsonProperty("DecidedOnGlossy")
    val decidedOnGlossy: kotlin.Boolean? = null,
    @JsonProperty("DecidedOnLayflat")
    val decidedOnLayflat: kotlin.Boolean? = null,
    @JsonProperty("DecidedOnWrapper")
    val decidedOnWrapper: kotlin.Boolean? = null,
    @JsonProperty("DecidedOnLinnen")
    val decidedOnLinnen: kotlin.Boolean? = null,
    @JsonProperty("DecidedOnFloatingFrame")
    val decidedOnFloatingFrame: kotlin.Boolean? = null,
    @JsonProperty("DecidedOnSmallerCopy")
    val decidedOnSmallerCopy: kotlin.Boolean? = null,
    @JsonProperty("ChosenExtraPages")
    val chosenExtraPages: ChosenExtraPagesDto? = null,
    @JsonProperty("ChosenCover")
    val chosenCover: ChosenCoverDto? = null,
    @JsonProperty("ChosenWoodFinishing")
    val chosenWoodFinishing: ChosenWoodFinishingDto? = null,
    @JsonProperty("ChosenPlanksOrientation")
    val chosenPlanksOrientation: ChosenPlanksOrientationDto? = null,
    @JsonProperty("ChosenVoucherDiscount")
    val chosenVoucherDiscount: ChosenVoucherDiscountDto? = null,
    @JsonProperty("ChosenGlossy")
    val chosenGlossy: ChosenGlossyDto? = null,
    @JsonProperty("ChosenLayFlat")
    val chosenLayFlat: ChosenLayFlatDto? = null,
    @JsonProperty("ChosenPremiumLayFlat")
    val chosenPremiumLayFlat: ChosenPremiumLayFlatDto? = null,
    @JsonProperty("ChosenWrapper")
    val chosenWrapper: ChosenWrapperDto? = null,
    @JsonProperty("ChosenCoverText")
    val chosenCoverText: ChosenCoverTextDto? = null,
    @JsonProperty("ChosenLinnen")
    val chosenLinnen: ChosenLinnenDto? = null,
    @JsonProperty("ChosenFloatingFrame")
    val chosenFloatingFrame: ChosenFloatingFrameDto? = null,
    @JsonProperty("ChosenSmallerCopy")
    val chosenSmallerCopy: kotlin.Any? = null,
    @JsonProperty("ChosenBorder")
    val chosenBorder: ChosenBorderDto? = null,
    @JsonProperty("ChosenEnhancement")
    val chosenEnhancement: ChosenEnhancementDto? = null,
    @JsonProperty("ChosenPaperType")
    val chosenPaperType: ChosenPaperTypeDto? = null,
    @JsonProperty("ChosenPrintSizes")
    val chosenPrintSizes: kotlin.Array<ChosenPrintSizeDto>? = null
)
