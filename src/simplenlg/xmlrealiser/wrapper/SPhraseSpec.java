//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.19 at 02:14:06 PM EDT 
//


package simplenlg.xmlrealiser.wrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPhraseSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPhraseSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://code.google.com/p/simplenlg/schemas/version1}PhraseElement">
 *       &lt;sequence>
 *         &lt;element name="cuePhrase" type="{http://code.google.com/p/simplenlg/schemas/version1}NLGElement" minOccurs="0"/>
 *         &lt;element name="subj" type="{http://code.google.com/p/simplenlg/schemas/version1}NLGElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vp" type="{http://code.google.com/p/simplenlg/schemas/version1}NLGElement"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://code.google.com/p/simplenlg/schemas/version1}sPhraseAtts"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPhraseSpec", propOrder = {
    "cuePhrase",
    "subj",
    "vp"
})
public class SPhraseSpec
    extends PhraseElement
{

    protected NLGElement cuePhrase;
    protected List<NLGElement> subj;
    @XmlElement(required = true)
    protected NLGElement vp;
    @XmlAttribute(name = "CLAUSE_STATUS")
    protected ClauseStatus clausestatus;
    @XmlAttribute(name = "COMPLEMENTISER")
    protected String complementiser;
    @XmlAttribute(name = "FORM")
    protected Form form;
    @XmlAttribute(name = "INTERROGATIVE_TYPE")
    protected InterrogativeType interrogativetype;
    @XmlAttribute(name = "MODAL")
    protected String modal;
    @XmlAttribute(name = "NEGATED")
    protected Boolean negated;
    @XmlAttribute(name = "PASSIVE")
    protected Boolean passive;
    @XmlAttribute(name = "PERFECT")
    protected Boolean perfect;
    @XmlAttribute(name = "PERSON")
    protected Person person;
    @XmlAttribute(name = "PROGRESSIVE")
    protected Boolean progressive;
    @XmlAttribute(name = "TENSE")
    protected Tense tense;

    /**
     * Gets the value of the cuePhrase property.
     * 
     * @return
     *     possible object is
     *     {@link NLGElement }
     *     
     */
    public NLGElement getCuePhrase() {
        return cuePhrase;
    }

    /**
     * Sets the value of the cuePhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NLGElement }
     *     
     */
    public void setCuePhrase(NLGElement value) {
        this.cuePhrase = value;
    }

    /**
     * Gets the value of the subj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NLGElement }
     * 
     * 
     */
    public List<NLGElement> getSubj() {
        if (subj == null) {
            subj = new ArrayList<NLGElement>();
        }
        return this.subj;
    }

    /**
     * Gets the value of the vp property.
     * 
     * @return
     *     possible object is
     *     {@link NLGElement }
     *     
     */
    public NLGElement getVp() {
        return vp;
    }

    /**
     * Sets the value of the vp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NLGElement }
     *     
     */
    public void setVp(NLGElement value) {
        this.vp = value;
    }

    /**
     * Gets the value of the clausestatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClauseStatus }
     *     
     */
    public ClauseStatus getCLAUSESTATUS() {
        return clausestatus;
    }

    /**
     * Sets the value of the clausestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClauseStatus }
     *     
     */
    public void setCLAUSESTATUS(ClauseStatus value) {
        this.clausestatus = value;
    }

    /**
     * Gets the value of the complementiser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPLEMENTISER() {
        return complementiser;
    }

    /**
     * Sets the value of the complementiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPLEMENTISER(String value) {
        this.complementiser = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link Form }
     *     
     */
    public Form getFORM() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link Form }
     *     
     */
    public void setFORM(Form value) {
        this.form = value;
    }

    /**
     * Gets the value of the interrogativetype property.
     * 
     * @return
     *     possible object is
     *     {@link InterrogativeType }
     *     
     */
    public InterrogativeType getINTERROGATIVETYPE() {
        return interrogativetype;
    }

    /**
     * Sets the value of the interrogativetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterrogativeType }
     *     
     */
    public void setINTERROGATIVETYPE(InterrogativeType value) {
        this.interrogativetype = value;
    }

    /**
     * Gets the value of the modal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODAL() {
        return modal;
    }

    /**
     * Sets the value of the modal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODAL(String value) {
        this.modal = value;
    }

    /**
     * Gets the value of the negated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNEGATED() {
        return negated;
    }

    /**
     * Sets the value of the negated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNEGATED(Boolean value) {
        this.negated = value;
    }

    /**
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPASSIVE() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPASSIVE(Boolean value) {
        this.passive = value;
    }

    /**
     * Gets the value of the perfect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPERFECT() {
        return perfect;
    }

    /**
     * Sets the value of the perfect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPERFECT(Boolean value) {
        this.perfect = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPERSON() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPERSON(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the progressive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPROGRESSIVE() {
        return progressive;
    }

    /**
     * Sets the value of the progressive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPROGRESSIVE(Boolean value) {
        this.progressive = value;
    }

    /**
     * Gets the value of the tense property.
     * 
     * @return
     *     possible object is
     *     {@link Tense }
     *     
     */
    public Tense getTENSE() {
        return tense;
    }

    /**
     * Sets the value of the tense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tense }
     *     
     */
    public void setTENSE(Tense value) {
        this.tense = value;
    }

}
