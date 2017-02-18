# weXgame

1. What is the proposed name for your Web application?
    - weXgame(X means exchange)
2. Who is the target audience for your Web application?
    - Video games players who eager to buy and collect physical game CDs but no time to go to the store. Or sometimes for games are out of print, the players who need to buy them from other players. Or teenager game players who want to buy cheap used games.
3. What problem is it intended to solve for the target audience?
    - Video games, no matter XBOX, Playstation or Wii, is hot for years. However, players' experience for buying the game are still not good at all. For some high recommended game, it's hard to get one as it just posted. For some teenagers, a game for them is too expensive. For some office worker, they have no time to buy one. Even though the network shop is online for every stations, players are still used to buy and collect physical one. Also, though many website has the blog for game review or way to pass, place where players can communicate is seldom.
    - So the aim for this project is to solve the problem as much as possible. All games are from players and posted with categories. One particular area is used so that people can buy or exchange their own games for new. And for brandly new games, players can pay for them from others instead of going to the store. And for some precious one, people can finish the auction with reasonable price. Current hot game will be recommended on the home page. All players can communicate their experience and review in the site's mini bbs board.
4. How will it meet the minimum project requirements?
    - My site will use the freemium model. User may be in the site with 3 kind of identificatiosn. First is the guest(without login), they can just buy normal games from others. The payment for them is only PayPal. Second is silver customer who just registered with their info. They have the accounts record in the site. With this ID, customers can participate the auction for precious games, and they can use the used area for their interested games with low price. What's more, they can post their brandly new game for others. But each successful deal will be deducted 1% deal fee by site. However, selling game in auction for them is invailable. The third ID is gold customer. All functions for them are available and free, but some membership fee should be paid for the site every month. One year payment is possible with discount. Both silver and gold customer may have an account balance, and recommended payment way is PayPal. All public data will be accessible through RESTful services. All RESTful services will data in both JSON and XML formats. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - My site has the mini bbs board which people can share their experiences and thoughts for games. And my site will support the auction function for precious game and for gold customers to post their precious game. In limit time customer who gives the highest price will be get the game. A authentication request for customer is available if they think the games they bought from others is fake. And a blacklist will be added if the situation is true.

### Assignment #1.3 Full Stack Step 1
1. Login Function is realized with default username and pasword
2. Current games and types can be shown correctly
3. A new game with correct type and ID can be added

## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-HaominHU.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-HaominHU)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site

[weXgame](https://damp-forest-90272.herokuapp.com/)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
