# Java Foundation Part 2

Hello, I am a new programmer and this repo is a follow up to my java foundation repo. I will be updating it with basic Java code suitable for beginners, for reference, for practice, etc. 

# How to add an existing (unversioned) project from your local machine to GitHub.

Let's say you've already created a new repo on Github, and now you want to create a new Java project in IntelliJ. How do you connect the project to github? (As opposed to creating a new Java project in IntelliJ first, and then creating the repo in Github, and then using the code provided by Github when you created the repo, in the IntelliJ terminal to connect them.)

**Create a new repo on Github.**

**Create a new java project in IntelliJ** (Open IntelliJ, select New Project, select Java, check the box for create from template.)

In your IntelliJ terminal (or from a terminal, navigate to your project directory)
Run the following git commands

<code>git init</code>

<code>git add .</code>     *(note there's a period in this command)*

<code>git commit -m “Initial commit”</code>

<code>git remote add origin git<span></span>@github.com:username/projectname.git</code> (Or, the https version if you don't use SSH: 
https:<span></span>//github.com/username/projectname.git  You can find this name in your Github repo when you click on the green Code button as if you're going to clone the repo)

<code>git push -u origin master</code> (If you've already renamed your default branch in Github from master to main you can probably use <code>git push -u origin main</code>. You can use <code>git remote -v</code> to see if it's connected to a remote branch.)
I accidentally used <code>git push origin master</code> instead of <code>git push -u origin master</code>. (I left off the -u)
Next, I logged into Github and it's showing I can compare and pull. 

<img width="907" alt="Screen Shot 2022-06-14 at 8 28 58 PM" src="https://user-images.githubusercontent.com/88731567/173716028-cff5623d-f306-4eca-8329-a67d87505155.png">

I ended up with a master branch on my local computer and a main branch on Github. (I believe git init creates the master branch by default when you run git init). Master is my local branch in IntelliJ, type <code>git branch</code> in the IntelliJ terminal to see what branch you're on. (or look in the bottom right corner of Intellij)

I can't do the git pull because github says **"There isn't anything to compare. main and master are entirely different commit histories."**

<img width="963" alt="nothing-to-compare" src="https://user-images.githubusercontent.com/88731567/173716104-f18671aa-c146-4a8a-9342-63c17fa28ebb.png">

To solve this issue, run the following commands in the terminal:

<code>git checkout master</code>

<code>git branch main master -f</code>

<code>git checkout main</code>

<code>git push origin main -f</code>

This is a forced update, you are now on the main branch and github should be good now.

Credits:
https://www.javacodegeeks.com/2014/04/how-to-add-an-intellij-project-to-github.html

