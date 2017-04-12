# Objective 4: Introdution to the World Wide Web and how it works

References 
- https://en.wikipedia.org/wiki/Internet_Protocol
- https://www.youtube.com/watch?v=scWj1BMRHUA
- https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html

## Various things we've learned
- The Internet links networks of machines around the world
- The web is one of many protocols using the Internet
- Other protocols include include; SMTP(Simple Mail Transfer Protocol), FTP(File Transfer Protocol), and SSH(Secure Shell)
- The web deals with:
	* How web pages are accessed
	* How pages link to content

## Assignement findings

Some definitiions we need
- a static web site: a site that does not need server computation. Only delivery of content: text (html), images (png, jpg, svg), music (m4a), video (mpg), etc.
- a dynamic web site is one that may need more horsepower under demand as it needs to compute user requests: taxes on a shopping cart, put together a personalized social media page, etc.
- HTML is commonly used to render data while CSS is used to present that data in a more visually pleasing way.

GET
*We found that using Firefox to navigate to https://www.thurstonplayers.org/  results in a GET, the default HTTP verb on browsers.
When we inspect the page and open the inspector, we notice that in the network traffic list, the base page is a GET as well.
*https://www.rolex.com/rolex-dealers/dealer-locator.html search in the rolex map is a GET location instead of a post zip code query, apparently a choice made by webmasters at Rolex
*https://www.rolex.com/content/rolexcom/en/_jcr_content/par/retailer_banner.nocache.html
*https://www.rolex.com/content/rolexcom/en/_jcr_content/par/banner_push_fav_watc.nocache.html
*https://www.rolex.com/content/campaigns/rolexcom/global/homepage/heroslideshow/usa/_jcr_content/par.en.disabled.html
*https://help.steampowered.com/en/ Upon analysing the inspect element, 36 GETs were presented. The purpose of these were style sheets, loading images, fonts, and scripts. In total it took the page nearly 4 seconds(3.84) to fully load.

POST:
https://www.thurstonplayers.org/cast/cast?destination=node/74 is the cast login page, which requires username and password. Typing anything in this page reveals that post is used in the inspector
https://store.steampowered.com/login/getrsakey/ This is an rsa key behind the scenes, and we don't know anything about it. Likely for security because the name suggests GET rsa key.
https://store.steampowered.com/login/dologin/ is the account login page, which also requires a username and password. Typing into the two bars shows a post in the inspector.

*I changed a couple lines and removed the advertisements on this website: http://science.howstuffworks.com/question493.htm