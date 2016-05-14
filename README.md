# LBXchange() {

*CSULB's marketplace for students*

## Table of Contents

  1. [Synopsis](#synopsis)
  1. [Design](#design)
  1. [Motivation](#motivation)
  1. [Installation](#installation)
  1. [Tests](#tests)
  1. [Contributors](#contributors)
  1. [License](#license)

## Synopsis

LBXchange is a web project built to meet the material needs of students at CSULB (http://www.csulb.edu) through mutual item exchanges. The development is currently open to all who have been invited or are familiar with web programming and would like to participate. 

## Design

We are using [Ruby on Rails](http://rubyonrails.org/) with [Bootstrap](http://getbootstrap.com/) intergration to build the website. 
The web model and structure will look similar to that of [Twitter](https://twitter.com/?lang=en) in addition of our own flavor and school theme.

**Necessary Languages:**
- HTML
- CSS 
- Javascript
- Ruby/Rails
- Git 

See the project on [Trello](httpsgi://trello.com/b/oHUHYQME/lbxchange-web)

## Motivation

LBX will act as a hub for students to buy and sell books, electronics, and miscellaneous to each other on one website in contrast to the fragments of different Facebook groups intended to do the same. We want our users to pursue a cheaper alternative to their needs rather than resorting to the price inflation at the bookstore. We aim to integrate the simplicity of Craigslist, the social structure of Twitter, and the bidding system of eBay while maintaining the perception of a local network. We know that the key here is to have users feel that they are relevant to a small, school-based community.

## Installation

If you would like to work with us, fork the project and make your contributions!

**A Quick Reference to Git commands**

The local repository consists of three "trees". 
The first one is your *Working Directory* which holds the actual files. 
The second one is the *Index* which acts as a staging area and finally the *HEAD* which points to the last commit you've made.

*Getting the latest version of the code:*

Case 1: Don’t care about local changes

- git reset --hard HEAD
- git clean -f
- git pull

Case 2: Care about local changes

- git fetch origin
- git status
- git pull

*Commiting your changes:*

- git status
- git add –A
- git commit –m "commit message"
- git push origin master

**References:**

- *git pull* : updates your local repository to the newest commit

- *git merge branch* : merges another branch into your active branch (e.g. master).

- *git status* : gets the status of all changes.

- *git add –A* : adds all the changes to index.

- *git commit –m* "commit message" : commit to the head.

- *git push origin master* : push the commit to /master branch (could be another branch).

Learn more at: [Git Commands](http://rogerdudler.github.io/git-guide/)

**File Navigation**

- *app/controllers/concerns* : stores all the controllers for the pages as backend ruby files.

- *app/views* : where /layout and /pages html.erb files are stored.

- *config/locales/routes.rb* : used to set paths for pages.

- *vendor/gemfiles* : use to import assets and gems. Then use ($ bundle install) to install them. Examples…
  for twitter UI components inc. navbar gem 'bootstrap-sass', '~> 3.3.6'
  Use SCSS for stylesheets gem 'sass-rails', '~> 5.0'

- *app/assets* : holds images, javascript, and stylesheets(css/scss) files.

## Tests

Constructing additional pylons.

## Contributors

[Hoang Dao](https://github.com/S1v4)

[Steven Garcia](https://github.com/stevenGarciaDev)

## License

Constructing additional pylons.

**[⬆ back to top](#table-of-contents)**

# };
