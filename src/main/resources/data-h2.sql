INSERT INTO TORTUE(codet, nom) VALUES
        (18, 'Franklin'),
        (12, 'Ninja'),
        (34, 'Hermann');
-- réinitialiser le compteur de clé auto-générée
ALTER TABLE TORTUE ALTER COLUMN codet RESTART WITH 35;

INSERT INTO ETABLISSEMENT(codeet, nom, adresse) VALUES
        (1,'Polyclinique Lambert', '23, avenue de Toulouse - 81000 Albi'),
        (2,'Laboratoire Bardou', '23, avenue de Carmaux - 81160 Saint-Juery');
ALTER TABLE ETABLISSEMENT ALTER COLUMN codeet RESTART WITH 3;

INSERT INTO SERVICE(codeservice, nom, batiment, codeet) VALUES
        ('12','Lingerie','Bat. C2', 1),
        ('2','Analyse','Bat. E4', 1),
        ('17', 'Traumatologie', 'Bat. B1', 1),
        ('45', 'Radiologie', 'Bat. B4', 2),
        ('21', 'Pneumologie', 'Bat. Z7', 1);

INSERT INTO GARE(codeg, codeservice, nomgare, type) VALUES
    ('1', '17','Trauma1', 'Linge'),
    ('2', '17','Trauma2', 'Analyse'),
    ('12', '12','Lingerie12','Linge'),
    ('13', '2','Analyse1','Analyse'),
    ('34', '21','Pneumologie1','Pneumologie'),
    ('76', '45','Radiologie1','Radiologie');

INSERT INTO CONTAINER(codec, type, etat, contenu) VALUES
    (98, 'Linge','En service', 'Plein'),
    (106, 'Repas','En service', 'Plein'),
    (116, 'Analyse','En service', 'Vide');
ALTER TABLE CONTAINER ALTER COLUMN codec RESTART WITH 117;

INSERT INTO TRANSPORTMATERIEL(idtransport, codet, codec, codeg_gare_depart, codeg_gare_arrivee, date_t, heuredepart, heurearrivee)
    VALUES(7432, 18, 98, '1' ,  '12', '2008-11-12', '10:55','11:30'),
          (7612, 18, 98, '1' ,  '12', '2008-11-12', '11:05','11:35'),
          (5712, 12, 116, '2' ,  '13','2008-11-19', '14:05','14:35'),
          (8756, 18, 98, '12', '1', '2008-12-18',   '10:30', null);
ALTER TABLE TRANSPORTMATERIEL ALTER COLUMN idtransport RESTART WITH 8757;


INSERT INTO PATIENT(ipp, nom, prenom, datenaiss) VALUES 
        (1, 'Dupont','Jean','1963-01-01'),
        (101, 'Raviere','Leon','1913-08-17'),
        (109, 'Grug','Louis','1947-03-19'),
        (10, 'Barlois-Leroux', 'Valerie', '1947-03-19'),
        (2, 'Flessel-Colovic', 'Laura', '1947-03-19'),
        (3, 'Obry', 'Hugues', '1947-03-19'),
        (4, 'Srecki', 'Eric', '1947-03-19'),
        (5, 'Wuilleme', 'Adeline', '1947-03-19'),
        (6, 'Di Martino', 'Jean-francois', '1947-03-19'),
        (7, 'Gourdain', 'Matthieu', '1947-03-19'),
        (8, 'Pillet', 'Julien', '1947-03-19'),
        (9, 'Touya', 'Damien', '1947-03-19'),
        (102, 'Ferrari', 'Jean-Noel', '1947-03-19'),
        (11, 'Guyart', 'Brice', '1947-03-19'),
        (12, 'Plumenail', 'Lionel', '1947-03-19'),
        (13, 'Tripathi', 'Sangita', '1947-03-19'),
        (53, 'Douillet', 'David', NULL),
        (21, 'Martinez', 'Miguel', NULL),
        (22, 'Ballenger', 'Felicia', NULL),
        (31, 'Dumoulin', 'Franck', NULL),
        (41, 'Asloum', 'Brahim', NULL),
        (56, 'Estanguet', 'Tony', NULL),
        (77, 'Vandenhende', 'Severine', NULL),
        (87, 'Racinet', 'Delphine', NULL),
        (98, 'Benboudaoud', 'Larbi', NULL),
        (90, 'Guibal', 'Brigitte', NULL),
        (103, 'Clinet', 'Marion', NULL),
        (117, 'Varonian', 'Benjamin', NULL),
        (123, 'Lebrun', 'Celine', NULL),
        (145, 'Maracineanu', 'Roxana', NULL),
        (23, 'Rousseau', 'Florian', NULL),
        (201, 'Di Pasquale', 'Arnaud', NULL),
        (25, 'Longo', 'Jeannie', NULL),
        (202, 'Thomas', 'Jerome', NULL),
        (203, 'Gentil', 'Pascal', NULL),
        (204, 'Traineau', 'Stephane', NULL),
        (205, 'Demontfaucon', 'Frederic', NULL),
        (206, 'Bardet', 'Anne-Lise', NULL),
        (208, 'Gane', NULL, NULL),
        (209, 'Tournant', NULL, NULL),
        (210, 'Rolland', NULL, NULL),
        (211, 'Andrieux', NULL, NULL),
        (212, 'Porchier', NULL, NULL),
        (213, 'Bette', NULL, NULL),
        (214, 'Hocde', NULL, NULL),
        (215, 'Dorfman', NULL, NULL),
        (207, 'Poujade', 'Eric', NULL),
        (216, 'Gatien', NULL, NULL),
        (217, 'Chila', NULL, NULL),
        (218, 'Chapelle', NULL, NULL),
        (219, 'Touron', NULL, NULL),
        (220, 'Dedieu', NULL, NULL),
        (221, 'Lignot', NULL, NULL);
ALTER TABLE PATIENT ALTER COLUMN ipp RESTART WITH 8757;

INSERT INTO PERSONNEL(code, nom, prenom) VALUES
        (12, 'Durand', 'Georges'),
        (13, 'Leroy', 'Paul'),
        (14, 'Leo', 'Pierre'),
        (15, 'Durand', 'Jean'),
        (16, 'Loiret', 'Jean'),
        (17, 'Tran', 'Leon'),
        (18, 'Ariege', 'Anne'),
        (19, 'Lozaire', 'Paul');
ALTER TABLE PERSONNEL ALTER COLUMN code RESTART WITH 20;

INSERT INTO EXAMEN(numexamen, ipp, type, natureacte, contagiosite, date_e, heure, commentaire) VALUES
    (790,1,'Radio' , 'Scanner de la hanche', 0, '2007-11-28', '10:45', 'urgent' ),
    (791, 1, 'Radio' , 'Scanner facial', 0,'2007-11-28', '07:15','urgent'),
    (792,101, 'Radio' , 'Radio des poumons', 0,  '2007-11-28', '10:15',NULL ),
    (793,109, 'Analyse' , 'Prise de sang', 0,  '2007-11-28', '09:15',NULL),
    (794,6, 'Analyse' , 'Prise de sang', 0,  '2007-11-28','09:30',NULL),
    (795,8, 'Analyse' , 'Prise de sang', 0,  '2007-11-28', '09:45',NULL),
    (796,12, 'Radio' , 'Radio des poumons', 0,  '2007-11-27', '10:15',NULL ),
    (797,12, 'Radio' , 'Radio des poumons', 0,  '2007-11-29', '10:15',NULL ),
    (798,12, 'Radio' , 'Scanner facial', 0,'2007-11-29',    '08:15','urgent'),
    (799,25, 'Radio' , 'Radio des hanches', 0,'2007-11-27', '13:15','urgent'),
    (800,53, 'Radio' , 'Radio des hanches', 0,'2007-11-27', '13:45','urgent');
ALTER TABLE EXAMEN ALTER COLUMN numexamen RESTART WITH 801;


INSERT INTO TRANSPORTPERSONNE(idtransport, codeservice_service_depart, ipp, numexamen, codeservice_service_arrivee, date_t, heuredepart, heurearrivee) VALUES
    (7432, '45',1,790,'17',  '2007-11-28',   '10:30','10:40' ),
    (7437, '17', 1,790,'45','2007-11-28',    '11:30','11:50' ),
    (7439, '45',1,791,'17',  '2007-11-28',   '15:00','15:10'),
    (7443, '17',1,791,'45',  '2007-11-28',   '16:30','16:40' ),
    (7446, '45', 101, 792,'21','2007-11-28', '11:30','11:55' ),
    (7448, '21', 101, 792,'45','2007-11-28', '12:30','13:55' );
ALTER TABLE TRANSPORTPERSONNE ALTER COLUMN idtransport RESTART WITH 7449;

INSERT INTO EFFECTUER(code, idtransport) VALUES
    (12, 7432),
    (13, 7432),
    (12, 7437),
    (13, 7437),
    (14, 7439),
    (15, 7439),
    (14, 7443),
    (15, 7443),
    (12, 7446),
    (15, 7446),
    (13, 7448),
    (15, 7448);

-- INSERTING into REGIONS
Insert into REGIONS (CODEREG,NOMREG) VALUES
    ('Br','Bretagne'),
    ('Bn','Basse-Normandie'),
    ('Hn','Haute-Normandie'),
    ('An','Alsace'),
    ('Ce','Centre Val de Loire'),
    ('Co','Corse'),
    ('IdF','Ile-de-France'),
    ('PL','Pays de la Loire'),
    ('PACA','Provence-Alpes-Cote-d''Azur'),
    ('AuRA','Auvergne Rhone-Alpes'),
    ('HdF','Hauts-de-France'),
    ('GE','Grand-Est'),
    ('Oc','Occitanie'),
    ('NA','Nouvelle Aquitaine'),
    ('No','Normandie'),
    ('BFC','Bourgogne Franche-Comte');


-- INSERTING into DEPARTEMENTS

Insert into DEPARTEMENTS (IDEPT,NOMDEPT,NBHAB,CODEREG)   values 
    ('1','Ain',471016,'AuRA'),
    ('2','Aisne',537222,'HdF'),
    ('3','Allier',357710,'AuRA'),
    ('4','Alpes-de-Haute-Provence',130883,'PACA'),
    ('5','Hautes-Alpes',113272,'PACA'),
    ('6','Alpes-Maritimes',971763,'PACA'),
    ('7','Ardeche',277579,'AuRA'),
    ('8','Ardennes',296333,'GE'),('9','Ariege',136483,'Oc'),
    ('10','Aube',289145,'GE'),
    ('11','Aude',298712,'Oc'),
    ('12','Aveyron',270054,'Oc'),
    ('13','Bouches-du-Rhone',1759098,'PACA'),
    ('14','Calvados',618468,'No'),
    ('15','Cantal',158723,'AuRA'),
    ('16','Charente',342268,'NA'),
    ('17','Charente-Maritime',527142,'NA'),
    ('18','Cher',321548,'Ce'),
    ('19','Correze',237859,'NA'),
    ('20','Corse',249737,'Co'),
    ('21','Cote-d''Or',493867,'BFC'),
    ('22','Cote-d''Armor',538423,'Br'),
    ('23','Creuse',131346,'NA'),
    ('24','Dordogne',386354,'NA'),
    ('25','Doubs',484770,'BFC'),
    ('26','Drome',414072,'AuRA'),
    ('27','Eure',513818,'No'),
    ('28','Eure-et-Loire',396064,'Ce'),
    ('29','Finistere',838662,'Br'),
    ('30','Gard',585049,'Oc'),
    ('31','Haute-Garonne',925958,'Oc'),
    ('32','Gers',174566,'Oc'),
    ('33','Gironde',1213482,'NA'),
    ('34','Herault',794603,'Oc'),
    ('35','Ille-et-Vilaine',798715,'Br'),
    ('36','Indre',237505,'Ce'),
    ('37','Indre-et-Loire',529328,'Ce'),
    ('38','Isere',1016227,'AuRA'),
    ('39','Jura',248759,'BFC'),
    ('40','Landes',311458,'NA'),
    ('41','Loire-et-Cher',305925,'Ce'),
    ('42','Loire',746288,'AuRA'),
    ('43','Haute-Loire',206568,'AuRA'),
    ('44','Loire-Atlantique',1052109,'PL'),
    ('45','Loiret',580601,'Ce'),
    ('46','Lot',224754,'Oc'),
    ('47','Lot-et-Garonne',305988,'NA'),
    ('48','Lozere',72814,'Oc'),
    ('49','Maine-et-Loire',705869,'PL'),
    ('50','Manche',479630,'No'),
    ('51','Marne',558309,'GE'),
    ('52','Haute-Marne',204255,'GE'),
    ('53','Mayenne',278016,'PL'),
    ('54','Meurte-et-Moselle',711952,'GE'),
    ('55','Meuse',196344,'GE'),
    ('56','Morbihan',619754,'Br'),
    ('57','Moselle',1011261,'GE'),
    ('58','Nievre',233278,'BFC'),
    ('59','Nord',2531855,'HdF'),
    ('60','Oise',725575,'HdF'),
    ('61','Orne',293183,'No'),
    ('62','Pas-de-Calais',1433203,'HdF'),
    ('63','Puy-de-Dome',598213,'AuRA'),
    ('64','Pyrenees-Atlantique',578475,'NA'),
    ('65','Hautes-Pyrenees',155813,'Oc'),
    ('66','Pyrenees-Orientales',363793,'Oc'),
    ('67','Bas-Rhin',953053,'GE'),
    ('68','Haut-Rhin',671319,'GE'),
    ('69','Rhone',1508967,'AuRA'),
    ('70','Haute-Saone',229659,'BFC'),
    ('71','Saone-et-Loire',559413,'BFC'),
    ('72','Sarthe',513614,'PL'),
    ('73','Savoie',348312,'AuRA'),
    ('74','Haute-Savoie',568256,'AuRA'),
    ('75','Paris',2152333,'IdF'),
    ('76','Seine-Maritime',1223429,'No'),
    ('77','Seine-et-Marne',1078145,'IdF'),
    ('78','Yvelines',1307145,'IdF'),
    ('79','Deux-Sevres',346280,'NA'),
    ('80','Somme',547825,'HdF'),
    ('81','Tarn',342741,'Oc'),
    ('82','Tarn-et-Garonne',200220,'Oc'),
    ('83','Var',814731,'PACA'),
    ('84','Vaucluse',467075,'PACA'),
    ('85','Vendee',509293,'PL'),
    ('86','Vienne',380181,'NA'),
    ('87','Haute-Vienne',353586,'NA'),
    ('88','Vosges',386234,'GE'),
    ('89','Yonne',323096,'BFC'),
    ('90','Territoire-de-Belfort',134097,'BFC'),
    ('91','Essone',1084827,'IdF'),
    ('92','Hauts-de-Seine',1391314,'IdF'),
    ('93','Seine-St-Denis',1381169,'IdF'),
    ('94','Val-de-Marne',1215538,'IdF'),
    ('95','Val-d''Oise',1049598,'IdF');