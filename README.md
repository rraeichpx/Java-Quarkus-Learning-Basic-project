STEP-1
---------------------------------------------------------------------------------------------------------------------------------------------------
    The files I used for JavaQuarkus STEP-1 are provided in the STEP_1 folder. Screenshots of the projects are also given in the screenshots folder.

    Step 1:

    First, I added RESTeasy to the project by including it in the pom.xml file:

    <dependency>
        <groupId>io.quarkus</groupId>
        <artifactId>quarkus-resteasy-jsonb</artifactId>
    </dependency>


    Step 2:

    I created a student-request.http file and, after some examples and testing, added the classes I created as JSON.

    Step 3:

    I changed the GET method in the main class to POST.
    I imported JSON type using @Consumes(MediaType.APPLICATION_JSON) (so that it does not give ERROR 415).
    Then, I created a Student class along with a related School class.

    Final Step:

    I sent the JSON request via HTTP using the Send Request option.

    The output is provided in the text file named result.txt.

    NOTE: I have dealt with JSON files a lot when using Firebase, so I know their structure well.
---------------------------------------------------------------------------------------------------------------------------------------------------
STEP-2
---------------------------------------------------------------------------------------------------------------------------------------------------
	The files I used for JavaQuarkus STEP-2 are provided in the STEP_2 folder. Screenshots of the projects are also given in the screenshots folder.
	
	Step 1:
	
	First, I watched a video to learn the structure of HTML.
	
	
	Step 2:
	
	Then, I watched another video to learn how to use HTML with Java Quarkus and prepared the main code by making the necessary QUTE implementations. 
	I also did a quick test with a short HTML code.
	
	<dependency>
		<groupId>io.quarkus</groupId>
		<artifactId>quarkus-qute</artifactId>
	</dependency>
	<dependency>
		<groupId>io.quarkus</groupId>
		<artifactId>quarkus-resteasy-qute</artifactId>
	</dependency>
	
	Final Step:
	
	Finally, I expanded the HTML code and created a Gladiator Info page.
	
	Here’s the link:
	
	http://localhost:8080/hello-view?name=Max&yearsold=24&hometown=Munich
---------------------------------------------------------------------------------------------------------------------------------------------------
STEP-3 AND 4
---------------------------------------------------------------------------------------------------------------------------------------------------
	Step 1
	
	First, I watched a video to learn the basic structure of an HTML form (Button, checkbox, radioButton, etc.—I’m already familiar with these from Android Studio).
	
	Step 2
	
	By writing GET and POST methods, I first submitted the form without a greeting, filled it out, and printed the information.
	
	Step 3
	
	However, with HTMX, this can be done faster and without reloading the entire page. To understand the concepts of greeting and HTMX, I researched a few resources. Then, to import HTMX, I used:
	
	<script src="https://cdn.jsdelivr.net/npm/htmx.org@2.0.7/dist/htmx.min.js"></script>
	
	
	This imports HTMX, a JS library. After that, I created a separate HTML file called greeting.html for the part that will be updated and included it in hello-form.html.
	
	I also adjusted the code accordingly, which allowed me to use the QUTE template in the most efficient way. HTMX performs server-side rendering and updates only the part of the page that needs to change without refreshing the whole page.
---------------------------------------------------------------------------------------------------------------------------------------------------
SOME SOURCES I USED:

https://www.youtube.com/watch?v=RcxvrhQKv8I
https://www.youtube.com/watch?v=8aZdcw9OO6g
https://jhooq.com/getting-started-with-quarkus/

https://www.youtube.com/watch?v=uwDxIVHg1HY
https://www.youtube.com/watch?v=hkxZxQQ0_5g

https://htmx.org/
https://www.youtube.com/watch?v=_YRmI-MasEA
https://www.youtube.com/watch?v=28a9xCrBgX4

https://www.reddit.com/r/webdev/comments/1ec9824/what_is_htmx_and_why_is_it_almost_as_desired_as/?tl=tr
