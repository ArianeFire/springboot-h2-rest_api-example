## Version null to null
---
### What's New
---
* `GET` /referentiel/support Recuperer la liste des supports

### What's Deprecated
---

### What's Changed
---
`GET` /referentiel/fonctionsrepresentantlegal Liste des statuts juridiques (INSEE) d'une personne morale  
    Return Type

        Modify code //${com.apicil.cosy.referentiel.dto.TrPmFonctionRepresentantDto.code}
        Modify libelle //${com.apicil.cosy.referentiel.dto.TrPmFonctionRepresentantDto.libelle}
`GET` /referentiel/produit/{codeProduit} Récupérer les informations essentielles du produit  
    Return Type

        Insert ouvertPersonneMorale //Eligibilité du produit à la personne morale
        Modify derogationFraisVC //${com.apicil.cosy.referentiel.dto.derogationFraisVC}
        Modify destinataireReglementVersement //Information sur l'adresse d'envoi du courrier postale 
        Modify plafondVersements //${com.apicil.cosy.referentiel.domain.dto.ProduitDto.plafond.versements}
        Modify transfertCible //${com.apicil.cosy.referentiel.domain.dto.ProduitDto.transfertCible}
        Modify transfertSource //${com.apicil.cosy.referentiel.domain.dto.ProduitDto.transfertSource}
        Modify versementRib //${com.apicil.cosy.souscription.dto.ProduitDto.versementRib}
`GET` /referentiel/statutsjuridique Liste des statuts juridiques d'une personne morale  
    Return Type

        Modify code //${com.apicil.cosy.referentiel.dto.TrPmStatutJuridiqueDto.codeINSEE}
        Modify libelle //${com.apicil.cosy.referentiel.dto.TrPmStatutJuridiqueDto.libelle}
`GET` /referentiel/typePatrimoine Récupérer la liste des types de patrimoines  
    Return Type

        Insert enveloppe //Un regroupement de type du patrimoine
        Modify categorie
`GET` /referentiel/typeRevenu Récupérer la liste des types de revenus  
    Return Type

        Insert enveloppe //Un regroupement de type du patrimoine
        Modify categorie
