FROM maven:3.8.4-openjdk-17-slim AS build

# Définit le répertoire de travail dans le conteneur
WORKDIR /app

# Copie du fichier pom.xml pour installer les dépendances
COPY pom.xml .

# Installe les dépendances du projet
RUN mvn dependency:go-offline

# Copie du reste des fichiers sources
COPY src src

# Compile le projet
RUN mvn package

# Utilise une image JDK 17 mince comme image de production
FROM openjdk:17 AS final

# Définit le répertoire de travail dans le conteneur
WORKDIR /app

# Copie du fichier JAR généré
COPY --from=build /app/target/Make_illegal_states_unrepresentable_exemple-1.0-SNAPSHOT.jar .

# Commande par défaut pour démarrer l'application
CMD ["java", "-jar", "Make_illegal_states_unrepresentable_exemple-1.0-SNAPSHOT.jar"]