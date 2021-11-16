## Version 1.0 to 1.0
---
### What's New
---

### What's Deprecated
---

### What's Changed
---
`GET` /projetcomptetitres/{id} Récupérer toutes les informations d'un projet d'ouverture de compte-titres  
    Return Type

        Insert connaissanceClient.originePatrimoine //Uniquement pour PPE et proche PPE, obligatoire pour chaque type de patrimoine saisi.
        Insert connaissanceClientPM.dateSignatureClient //La date de signature
        Insert connaissanceClientPM.dateCreation //La date de creation de la personne morale
        Insert connaissanceClientPM.paysEnregistrement //Pays enregistrement de la personne morale
        Delete connaissanceClient.client.capaciteEpargne.montant //Montant de capacite d'epargne
        Delete connaissanceClient.client.situationProfessionnelle.anneeDepartRetraite //L'annee de depart à la retraite
        Delete connaissanceClient.client.situationProfessionnelle.categorieSocioProfessionnelle
        Delete connaissanceClient.client.situationProfessionnelle.informationsPPE
        Delete connaissanceClient.client.situationProfessionnelle.lienPPE
        Delete connaissanceClient.client.situationProfessionnelle.nomEntreprise //Nom d'entreprise 
        Delete connaissanceClient.client.situationProfessionnelle.professionActuelle //Profession actuelle 
        Delete connaissanceClient.client.situationProfessionnelle.secteurActivite
        Delete connaissanceClient.client.situationProfessionnelle.situationActuelle
        Delete connaissanceClient.client.situationProfessionnelle.travailleurNonSalarie //''true'' si le souscripteur es travailleur non salarié, ''false'' sinon
        Delete connaissanceClient.client.etatCivil.civilite
        Delete connaissanceClient.client.etatCivil.dateNaissance //Date de naissance 
        Delete connaissanceClient.client.etatCivil.nationalite
        Delete connaissanceClient.client.etatCivil.nom //Nom 
        Delete connaissanceClient.client.etatCivil.nomNaissance //Nom de naissance 
        Delete connaissanceClient.client.etatCivil.nombreEnfants //Nombre enfants à Charge
        Delete connaissanceClient.client.etatCivil.nombrePersonnesACharge //Nombre de personne à charge
        Delete connaissanceClient.client.etatCivil.pays
        Delete connaissanceClient.client.etatCivil.personnesACharge
        Delete connaissanceClient.client.etatCivil.prenom //Prénom 
        Delete connaissanceClient.client.etatCivil.regimeMatrimonial
        Delete connaissanceClient.client.etatCivil.situationFamiliale
        Delete connaissanceClient.client.etatCivil.villeNaissance
        Delete connaissanceClient.client.informationsFiscales.adresseFiscale.adresseComplementaire //Adresse complémentaire
        Delete connaissanceClient.client.informationsFiscales.adresseFiscale.adressePrincipale //Adresse principale
        Delete connaissanceClient.client.informationsFiscales.adresseFiscale.codePostal //Code postal
        Delete connaissanceClient.client.informationsFiscales.adresseFiscale.pays
        Delete connaissanceClient.client.informationsFiscales.adresseFiscale.ville
        Delete connaissanceClient.client.identiteFiscaleHorsFranceEtUSA1.numeroIdentiteFiscale //Numéro d'identité fiscale hors la France et l'Amérique
        Delete connaissanceClient.client.identiteFiscaleHorsFranceEtUSA1.pays
        Delete connaissanceClient.client.identiteFiscaleHorsFranceEtUSA2.numeroIdentiteFiscale //Numéro d'identité fiscale hors la France et l'Amérique
        Delete connaissanceClient.client.identiteFiscaleHorsFranceEtUSA2.pays
        Delete connaissanceClient.client.patrimoine.montant //Montant du patrimoine
        Delete connaissanceClient.client.patrimoine.preciserPatrimoine //Précisez dans la zone libre la nature du patrimoine ne relevant pas des catégories précitées, telles que Retraite Madelin, PEE, PERCO, Retraites supplémentaires (art 83, ...)
        Delete connaissanceClient.client.patrimoine.typePatrimoine
        Delete connaissanceClient.conjoint.etatCivil
        Delete connaissanceClient.conjoint.patrimoine //Si la catégorie "Autre" est sélectionnée, alors le champs "preciserPatrimoine" est obligatoire et ne peut être vide.
        Delete connaissanceClient.conjoint.revenus //Si la catégorie "Autre" est sélectionnée, alors le champs "preciserRevenu" est obligatoire et ne peut être vide.
        Delete connaissanceClient.conjoint.situationProfessionnelle
        Delete connaissanceClient.coordonnees.adresse
        Delete connaissanceClient.coordonnees.email //Email
        Delete connaissanceClient.coordonnees.jddHeberge
        Delete connaissanceClient.coordonnees.telephoneDomicile
        Delete connaissanceClient.coordonnees.telephoneMobile
        Delete connaissanceClient.foyer.patrimoine.montant //Montant du patrimoine
        Delete connaissanceClient.foyer.patrimoine.preciserPatrimoine //Précisez dans la zone libre la nature du patrimoine ne relevant pas des catégories précitées, telles que Retraite Madelin, PEE, PERCO, Retraites supplémentaires (art 83, ...)
        Delete connaissanceClient.foyer.patrimoine.typePatrimoine
        Delete connaissanceClientPM.secteurActivite.code //${com.apicil.cosy.connaissanceclient.dto.PMSecteurActiviteDto.code}
        Delete connaissanceClientPM.coordonnees.adresse.adresseComplementaire //Adresse complémentaire
        Delete connaissanceClientPM.coordonnees.adresse.adressePrincipale //Adresse principale
        Delete connaissanceClientPM.coordonnees.adresse.codePostal //Code postal
        Delete connaissanceClientPM.coordonnees.adresse.pays
        Delete connaissanceClientPM.coordonnees.adresse.ville
        Delete connaissanceClientPM.coordonnees.telephone.indicatif //Indicatif du téléphone 
        Delete connaissanceClientPM.coordonnees.telephone.numeroTelephone //Téléphone
        Delete connaissanceClientPM.representantLegalPrincipal.coordonnees.adresse
        Delete connaissanceClientPM.representantLegalPrincipal.coordonnees.email //Email
        Delete connaissanceClientPM.representantLegalPrincipal.coordonnees.jddHeberge
        Delete connaissanceClientPM.representantLegalPrincipal.coordonnees.telephoneDomicile
        Delete connaissanceClientPM.representantLegalPrincipal.coordonnees.telephoneMobile
        Delete connaissanceClientPM.representantLegalPrincipal.etatCivil.civilite.code //Code de la civilité
        Delete connaissanceClientPM.representantLegalPrincipal.etatCivil.departementNaissance.code //Code du département
        Delete connaissanceClientPM.representantLegalPrincipal.etatCivil.nationalite.code //Code de nationalité
        Delete connaissanceClientPM.representantLegalPrincipal.etatCivil.paysNaissance.code //Code ISO 2 du pays
        Delete connaissanceClientPM.representantLegalPrincipal.etatCivil.villeNaissance.code //Code INSEE de la ville. <br/> Si le pays de naissance est différent de France alors mettre le code "99999".
        Delete connaissanceClientPM.representantLegalPrincipal.etatCivil.villeNaissance.libelle //Nom de la ville. <br/> Si le pays de naissance est différent de France alors le nom de la ville est obligatoire.
        Delete connaissanceClientPM.representantLegalPrincipal.informationsPPE.fonction
        Delete connaissanceClientPM.representantLegalPrincipal.informationsPPE.paysExerce
        Delete connaissanceClientPM.representantLegalPrincipal.informationsPPE.ppeFonctionAutre //Préciser la fonction si autre
        Delete connaissanceClientPM.representantLegalPrincipal.informationslienPPE.fonction
        Delete connaissanceClientPM.representantLegalPrincipal.informationslienPPE.natureLien
        Delete connaissanceClientPM.representantLegalPrincipal.informationslienPPE.nom //Nom de la personne politiquement exposée en lien familial
        Delete connaissanceClientPM.representantLegalPrincipal.informationslienPPE.paysExerce
        Delete connaissanceClientPM.representantLegalPrincipal.informationslienPPE.ppeFonctionAutre //Fonction de la personne politiquement exposée en lien familial si autre
        Delete connaissanceClientPM.representantLegalPrincipal.informationslienPPE.prenom //Prénom de la personne politiquement exposée en lien familial
        Delete connaissanceClientPM.representantLegalPrincipal.obligationFiscales.pays.code //Code ISO 2 du pays
        Delete connaissanceClientPM.autresRepresentantsLegaux.coordonnees.adresse
        Delete connaissanceClientPM.autresRepresentantsLegaux.coordonnees.email //Email
        Delete connaissanceClientPM.autresRepresentantsLegaux.coordonnees.jddHeberge
        Delete connaissanceClientPM.autresRepresentantsLegaux.coordonnees.telephoneDomicile
        Delete connaissanceClientPM.autresRepresentantsLegaux.coordonnees.telephoneMobile
        Delete connaissanceClientPM.autresRepresentantsLegaux.etatCivil.civilite.code //Code de la civilité
        Delete connaissanceClientPM.autresRepresentantsLegaux.etatCivil.departementNaissance.code //Code du département
        Delete connaissanceClientPM.autresRepresentantsLegaux.etatCivil.nationalite.code //Code de nationalité
        Delete connaissanceClientPM.autresRepresentantsLegaux.etatCivil.paysNaissance.code //Code ISO 2 du pays
        Delete connaissanceClientPM.autresRepresentantsLegaux.etatCivil.villeNaissance.code //Code INSEE de la ville. <br/> Si le pays de naissance est différent de France alors mettre le code "99999".
        Delete connaissanceClientPM.autresRepresentantsLegaux.etatCivil.villeNaissance.libelle //Nom de la ville. <br/> Si le pays de naissance est différent de France alors le nom de la ville est obligatoire.
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationsPPE.fonction
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationsPPE.paysExerce
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationsPPE.ppeFonctionAutre //Préciser la fonction si autre
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationslienPPE.fonction
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationslienPPE.natureLien
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationslienPPE.nom //Nom de la personne politiquement exposée en lien familial
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationslienPPE.paysExerce
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationslienPPE.ppeFonctionAutre //Fonction de la personne politiquement exposée en lien familial si autre
        Delete connaissanceClientPM.autresRepresentantsLegaux.informationslienPPE.prenom //Prénom de la personne politiquement exposée en lien familial
        Delete connaissanceClientPM.autresRepresentantsLegaux.obligationFiscales.pays.code //Code ISO 2 du pays
        Delete connaissanceClientPM.beneficiaires.etatCivil.civilite.code //Code de la civilité
        Delete connaissanceClientPM.beneficiaires.informationsPPE.fonction
        Delete connaissanceClientPM.beneficiaires.informationsPPE.paysExerce
        Delete connaissanceClientPM.beneficiaires.informationsPPE.ppeFonctionAutre //Préciser la fonction si autre
        Delete connaissanceClientPM.beneficiaires.informationslienPPE.fonction
        Delete connaissanceClientPM.beneficiaires.informationslienPPE.natureLien
        Delete connaissanceClientPM.beneficiaires.informationslienPPE.nom //Nom de la personne politiquement exposée en lien familial
        Delete connaissanceClientPM.beneficiaires.informationslienPPE.paysExerce
        Delete connaissanceClientPM.beneficiaires.informationslienPPE.ppeFonctionAutre //Fonction de la personne politiquement exposée en lien familial si autre
        Delete connaissanceClientPM.beneficiaires.informationslienPPE.prenom //Prénom de la personne politiquement exposée en lien familial
        Delete connaissanceClientPM.beneficiaires.obligationFiscales.pays.code //Code ISO 2 du pays
        Delete connaissanceClientPM.patrimoines.montant //Montant du patrimoine
        Delete connaissanceClientPM.patrimoines.preciserPatrimoine //Précisez dans la zone libre la nature du patrimoine ne relevant pas des catégories précitées, telles que Retraite Madelin, PEE, PERCO, Retraites supplémentaires (art 83, ...)
        Delete connaissanceClientPM.patrimoines.typePatrimoine
        Delete connaissanceClientPM.obligationFiscales.pays.code //Code ISO 2 du pays
        Delete ouvertureCompteTitres.objectifInvestissement.code //Code objectif d'investissement
        Delete ouvertureCompteTitres.transferts.courtier.contact.telephone.indicatif //Indicatif du téléphone 
        Delete ouvertureCompteTitres.transferts.courtier.contact.telephone.numeroTelephone //Téléphone
        Delete ouvertureCompteTitres.transferts.etablissement.coordonnees.adresse.adresseComplementaire //Adresse complémentaire
        Delete ouvertureCompteTitres.transferts.etablissement.coordonnees.adresse.adressePrincipale //Adresse principale
        Delete ouvertureCompteTitres.transferts.etablissement.coordonnees.adresse.codePostal //Code postal
        Delete ouvertureCompteTitres.transferts.etablissement.coordonnees.adresse.pays
        Delete ouvertureCompteTitres.transferts.etablissement.coordonnees.adresse.ville
        Delete ouvertureCompteTitres.transferts.etablissement.coordonnees.telephoneMobile.indicatif //Indicatif du téléphone 
        Delete ouvertureCompteTitres.transferts.etablissement.coordonnees.telephoneMobile.numeroTelephone //Téléphone
        Delete ouvertureCompteTitres.versementInitial.origineDesFonds.ofAutre //Origine du fonds de type autre
        Delete ouvertureCompteTitres.versementInitial.origineDesFonds.ofAutreCommentaire //Commentaire sur les origines des fonds si ''autre'' est valorisé
        Delete ouvertureCompteTitres.versementInitial.origineDesFonds.ofAutresPlacements //Origine du fonds de type autres placements
        Delete ouvertureCompteTitres.versementInitial.origineDesFonds.ofBiensMobiliers //Origine du fonds de type biens mobiliers
        Delete ouvertureCompteTitres.versementInitial.origineDesFonds.ofCessionActifs //Origine du fonds de type cession d'actifs
        Delete ouvertureCompteTitres.versementInitial.origineDesFonds.ofRevenusPro //Origine du fonds de type revenus professionnels
        Delete ouvertureCompteTitres.versementInitial.origineDesFonds.ofSuccessionDonation //Origine du fonds de type succession donation
        Delete ouvertureCompteTitres.versementInitial.origineDesFonds.ofVenteImmobiliere //Origine du fonds de type ventre immobilière
        Modify connaissanceClient.dateExpiration //${com.apicil.cosy.connaissanceclient.dto.dateExpiration}
        Modify connaissanceClient.dateSaisie //${com.apicil.cosy.connaissanceclient.dto.dateSaisie}
        Modify connaissanceClient.dateValidite //${com.apicil.cosy.connaissanceclient.dto.dateValidite}
        Modify connaissanceClientPM.siren //Siren de la PM 
        Modify connaissanceClientPM.lei //Numéro LEI (Legal Entity Identifier) de la PM 
        Modify connaissanceClientPM.statutJuridique.code //${com.apicil.cosy.referentiel.dto.TrPmStatutJuridiqueDto.codeINSEE}
        Modify connaissanceClientPM.statutJuridique.libelle //${com.apicil.cosy.referentiel.dto.TrPmStatutJuridiqueDto.libelle}
        Modify connaissanceClientPM.representantLegalPrincipal.fonctionRepresentant.fonction.code //${com.apicil.cosy.referentiel.dto.TrPmFonctionRepresentantDto.code}
        Modify connaissanceClientPM.representantLegalPrincipal.fonctionRepresentant.fonction.libelle //${com.apicil.cosy.referentiel.dto.TrPmFonctionRepresentantDto.libelle}
        Modify connaissanceClientPM.autresRepresentantsLegaux.fonctionRepresentant.fonction.code //${com.apicil.cosy.referentiel.dto.TrPmFonctionRepresentantDto.code}
        Modify connaissanceClientPM.autresRepresentantsLegaux.fonctionRepresentant.fonction.libelle //${com.apicil.cosy.referentiel.dto.TrPmFonctionRepresentantDto.libelle}
        Modify ouvertureCompteTitres.frais.codeGrilleDroitDeGarde //${com.apicil.cosy.souscription.dto.FraisSurContratDto.bkCodeGrilleDroitGardeSaisi}
        Modify ouvertureCompteTitres.transferts.courtier.nom //Nom du courtier
        Modify ouvertureCompteTitres.transferts.etablissement.coordonnees.email
        Modify ouvertureCompteTitres.transferts.etablissement.nom //Le nom de l'etablissement
