Installation steps:

1. Set up Linux environment:

    * Install Oracle JDK 7
    
        ```
        sudo add-apt-repository ppa:webupd8team/java
        sudo apt-get update
        sudo apt-get install oracle-java7-installer
        ```
    
    * Install git
   
        ```
        sudo apt-get git maven
        ```

2. Get Eclipse Modeling Kepler (for Linux 64-bit) from http://www.eclipse.org/

    * Install the Xtext SDK from the Kepler update site:
    * Add the EMF-IncQuery integration update site:
      <http://download.eclipse.org/incquery/updates/integration>
    * Install EMF-IncQuery SDK 0.8.

3. Get the sources of the EMF-IncQuery solution for the imdb case:

    ```
    git clone https://anonymous@git.inf.mit.bme.hu/r/projects/viatra/ttc14-eiq
    ```

4. Inspecting the code.
 a. Import projects into Eclipse.

5. Running the benchmark.
 a. Open a terminal and navigate to the ttc14-imdb directory in the repository.
 b. Use ./build.sh to build the project.

6. Synthetic models
 a. Use the generate-all.sh script to generate the synthetic models.
 b. Use the transform-all.sh script to run the transformation.

