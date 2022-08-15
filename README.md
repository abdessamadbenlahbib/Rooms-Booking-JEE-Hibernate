# Rooms-Booking-JEE-Hibernate

--------------------------------------------------------------------------------
Thème : Réalisation d’une application de réservation des chambres d’hôtel en JEE.

Réalisé par : Benlahbib Abdessamad

Master : SIRM

Année : 2015 – 2016

Faculté des Sciences Dhar El Mehraz.

Département d’informatique.

--------------------------------------------------------------------------------

**Introduction**

Afin d’automatiser le processus de réservation des chambres d’hôtel, j'ai décidé de développer une application Web qui permette à un client de réserver une chambre pendant une durée déterminée.



1 – Les Technologies utilisés :

Pour la première version du programme :
-	Vue : JSP
-	Contrôleur : Servlets.
-	Persistance : Hibernate.

J'ai essayé d’exploiter tous ce que nous avons faits en cours:
-	Un contrôleur pour chaque JSP,
-	La gestion du cache.
-	Utilisation des sessions.
-	Minimiser l utilisation des Scriptlets dans les pages JSP.
-	Utilisation des JSTL.
-	Utilisation des EL (Expressions Langages).



2 – Diagramme de cas d utilisations :

![image](https://user-images.githubusercontent.com/42771693/184665581-1680f0d8-674c-4b1a-816c-6be08edccbd3.png)



3 -  Règles de gestions 

Dans ce paragraphe, je vais définir les règles de gestions de l'application:

-	Le « username » du client est unique.

-	Le client ne peut pas réserver une chambre pour une date dont elle est déjà réservée.

-	Le client ne peut pas réserver une chambre pour une date inferieur à la date courante.

-	Chaque Client est identifié par un « username » et un « password ».

-	Le client doit être connecté pour réserver une chambre.




4 – Outils de développement

Les outils (Application | Framework | Lib) utilisés pour développer l’application:
-	Tomcat (Serveur d’application)
-	MySQL (SGBD)
-	Java Data Base Connectivity (JDBC)
-	Eclipse (IDE)
-	Hibernate (Framework de persistance).
-	JSTL (Core Library).


Conception

1 – Diagramme de classe

![image](https://user-images.githubusercontent.com/42771693/184666369-9ea292a5-23f7-4743-8f72-625f0e21184f.png)
![image](https://user-images.githubusercontent.com/42771693/184666446-6573792d-bc17-4092-99cc-5ae77d64f033.png)

Implémentation et Test

1 - Implémentation

![image](https://user-images.githubusercontent.com/42771693/184666916-5c173644-aeaa-4895-a0ae-e89e51c10a66.png)
![image](https://user-images.githubusercontent.com/42771693/184667414-8f4cbc99-a5f2-4a22-8d99-9b933792d7ff.png)
![image](https://user-images.githubusercontent.com/42771693/184667442-8242974f-8948-4642-aec2-42f6c56798bf.png)
![image](https://user-images.githubusercontent.com/42771693/184667467-1f0d93b1-9046-46be-adab-c780c5b39029.png)

2 – Test

![image](https://user-images.githubusercontent.com/42771693/184667869-8af46c5b-e4dd-4351-9f23-ae02d404b4df.png)
![image](https://user-images.githubusercontent.com/42771693/184667914-d7ae2fdb-c906-4bd6-8c0a-fbaf9b1503e5.png)
![image](https://user-images.githubusercontent.com/42771693/184667938-82b9f761-ad7b-45f8-82a3-b6dbe700ee79.png)
![image](https://user-images.githubusercontent.com/42771693/184667958-12443eeb-4e2b-4c93-9869-f8c06fa2ea1e.png)
![image](https://user-images.githubusercontent.com/42771693/184667979-4ef488aa-0658-48f3-b13b-fa7e2a179305.png)
![image](https://user-images.githubusercontent.com/42771693/184667996-14d76d54-4207-4036-b3ce-117b8b62f660.png)
![image](https://user-images.githubusercontent.com/42771693/184668014-635118f4-30e8-489e-9c67-c13aa61a2f96.png)
![image](https://user-images.githubusercontent.com/42771693/184668027-d4a3394c-12bb-43c7-91bc-d9a23a994328.png)
![image](https://user-images.githubusercontent.com/42771693/184668062-c64ae37f-f0a2-42bd-b3d3-5c29e96c31cc.png)
![image](https://user-images.githubusercontent.com/42771693/184668071-61dbb879-03b4-49f1-9b31-68bd57088694.png)
![image](https://user-images.githubusercontent.com/42771693/184668085-22b8f5b5-ba41-4ccb-b7f8-f6e36547a9f8.png)


Conclusion

Dans la partie de conclusion, j'aimerais ajouter quelques idées d’extension du projet:

-	Automatiser le processus d’ajout de nouvelles chambres par l’administrateur de l’application.

-	Gérer plus d’exceptions.

-	Utiliser de nouveaux Frameworks.







