# Tactical Apes Website

## Summary
Tactical Apes website for AP CSA. Made using Thymeleaf, HTML, Java, and JavaScript. Deployed via Heroku. Click around to find hidden easter eggs and cool features! Link can be found <a href="https://csa-project.herokuapp.com/" target="_blank">here.</a>

The main goal of our website is to have a unique design that captures the attention of people looking at it. We also want our website to incorporate labs that demonstrate the Java we have learned this year. 

## Contributors
| GitHub Username | Person |
| --- | --- |
| [@VihanJ](https://github.com/VihanJ) | Vihan Jayaraman |
| [@EyaadM](https://github.com/eyaadm) | Eyaad Mir |
| [@YasaswiS](https://github.com/YasaswiS) | Yasaswi Singamneni |
| [@tonyhieu](https://github.com/tonyhieu) | Anthony Vo |

## Key Features
- [x] Multiple web pages that are navigable
- [x] Unique CSS Styling
- [x] Consistent layout
- [x] Interactable Labs
- [x] Easter Eggs
- [x] SQL Databases 

## Table of Contents
- [Navigation](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/README.md#navigation)
- [Accomplishments and Contributors](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/README.md#accomplishments-and-contributors)
- [Journals](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/README.md#journals)

## Navigation

Access our website at https://csa-project.herokuapp.com! 

Go to the "home" page to see our journals. 

You should see the following page:
<img src="https://media.discordapp.net/attachments/787235941373837332/818711475912048640/unknown.png?width=1366&height=670" width="1200" height="500">


Go to the "team" page by clicking "Team" in the header, to see the contributers to the website.
You'll be redirected to this webpage:
<img src="https://media.discordapp.net/attachments/787235941373837332/818711564164530176/unknown.png?width=1391&height=669" width="1200" height="500">

Go to the "labs" page by clicking on "Labs" in the header, to see our different labs.
You'll be redirected to this webpage:
<img src="https://media.discordapp.net/attachments/787235941373837332/818711639905009664/unknown.png?width=1376&height=669" width="1200" height="500">
Clicking on a link to a lab will give you instructions on what to put in each field.

 - You can also create League of Legends players in a database! Specify their name, champion, and mastery (number from 1 to 7)

<!--
## Goals and Tickets
| Person | Overall Goals | Progress | Ticket |
| --- | --- | --- | --- |
| Vihan Jayaraman | Work on implementing old simulations into website | Did research on how to incorporate swing into website | [Ticket](https://github.com/tonyhieu/P1-Tactical-Apes-Site/projects/4)
| Eyaad Mir | Add files labs and algorithms into website to show AP CSA requirements | Worked on [Palindrome](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/java/files/labs/Palindrome.java), [Fibonacci](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/java/files/labs/Fibonacci.java), and Cipher labs([Caesar](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/java/files/labs/Caesar.java) and [Rot13](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/java/files/labs/Rot13.java)). Also worked on the html for the [labs page](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/pages/labs.html). Made this [easter egg](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/52f6adaa6ec3d6053482fe16d974bb30245e50ef/src/main/resources/templates/pages/team.html#L38) | [Ticket](https://github.com/tonyhieu/P1-Tactical-Apes-Site/projects/3) | 
| Yasaswi Singamneni | Create back end support, deployment | Created the EC2 instance for our website, getting it deployed with [heroku](https://www.heroku.com/), changed the styling of the [header](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/header.html) and [footer](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/footer.html), edited the readme to add navigation, and helped on the integration with the [labs page.](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/pages/labs.html) | [Ticket](https://github.com/tonyhieu/P1-Tactical-Apes-Site/projects/2) |
| Anthony Vo | Web development, web design, HTML and CSS | Created the [styling](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/headfile.html), [header](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/header.html), [footer](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/footer.html), [home](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/index.html), and [team](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/pages/team.html) page for our website. Also made this [easter egg](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/52f6adaa6ec3d6053482fe16d974bb30245e50ef/src/main/resources/templates/pages/team.html#L26). There are more. Try to find them! | [Ticket](https://github.com/tonyhieu/P1-Tactical-Apes-Site/projects/1) |
-->

## Accomplishments and Contributors
| Technicals | Code | Ticket | Contributor |
| --- | --- | --- | --- |
| Website Layout and Design w/ Thymeleaf | [Footer](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/footer.html), [header](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/header.html), and [headfile](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/headfile.html). Set up CSS Styling for website. [Main controller](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/51ef45bef0a89ff1c2fbf0c45a244222270608b7/src/main/java/files/labs/MainController.java#L13-L25) used to link to other pages.  | [Ticket](https://github.com/tonyhieu/P1-Tactical-Apes-Site/projects/1) | Anthony |
| SQL Databases | [Folder for SQL](https://github.com/tonyhieu/P1-Tactical-Apes-Site/tree/master/src/main/java/files/labs/modelsSQL) contains all of the necessary files to set up SQL; [POJOs](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/java/files/labs/modelsSQL/Player.java) and [SQL Repository](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/java/files/labs/modelsSQL/PlayerSqlRepository.java) found here. [SQL Pages](https://github.com/tonyhieu/P1-Tactical-Apes-Site/tree/master/src/main/resources/templates/pages/mvc/sql) found here, contains all HTML pages for user interaction. SQL Database builds off of Mr. M's, as it includes different fields. | [Ticket](https://github.com/tonyhieu/P1-Tactical-Apes-Site/projects/5) | Anthony |
| Website Layout with Thymleaf and live deployment of website | Created the EC2 instance for our website, getting it deployed with [heroku](https://www.heroku.com/), changed the styling of the [header](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/header.html) and [footer](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/fragments/footer.html), edited the readme to add navigation, and helped on the integration with the [labs page.](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/master/src/main/resources/templates/pages/labs.html) | [Ticket](https://github.com/tonyhieu/P1-Tactical-Apes-Site/projects/2) | Yasaswi |
| Labs and Frqs | [Folder for labs](https://github.com/tonyhieu/P1-Tactical-Apes-Site/tree/master/src/main/java/files/labs) contains Palindrome, Fibonacci, Rot13, Caesar Cipher, and Common factor(called Recursion.java). Common Factor lab is based off the Unit 10 recursion FRQ. Connection between labs and html right [here](https://github.com/tonyhieu/P1-Tactical-Apes-Site/blob/5aa7700d909d91b45d767a9fd342e91de51bb2d3/src/main/java/files/labs/MainController.java#L39-75). | [Ticket](https://github.com/tonyhieu/P1-Tactical-Apes-Site/projects/3) | Eyaad |
| Lab html | [labs html folder](https://github.com/tonyhieu/P1-Tactical-Apes-Site/tree/master/src/main/resources/templates/pages/labs) here. Initialized lab html files. | Vihan |

## Journals
- [Eyaad and Anthony](https://docs.google.com/document/d/1_TAdjjngp_0zO604YmFBRjesVqBiyebn3PxdbbQfVCM/edit?usp=sharing)
- [Yasaswi and Vihan](https://docs.google.com/document/d/1YGXgR4pPUf52Tl2DBQ33JKAiH2Ob1iPUPTL69cVNPw8/edit?usp=sharing)




