# {{site.data.sampledata.name.first}} {{site.data.sampledata.name.last}}
## Software Developer and Lifelong Learner

This is my portfolio. Oh and also where I keep some guides. Feel free to use them, or submit corrections.

[A little about me](about.md)   | [What I've learned](cv.md) | Notes<br>


[![Email bfoster](https://img.shields.io/badge/Email-brandan@getfoster.net-green?style=for-the-badge)](mailto:brandan@getfoster.net)
[![Website bfoster](https://img.shields.io/badge/Website-./getfoster-yellow?style=for-the-badge)](https:www.getfoster.net/hire-me)
[![Twitter realdogdad](https://img.shields.io/badge/Twitter-@real_dog_dad-9cf?style=for-the-badge)](https://twitter.com/real_dog_dad)
[![LinkedIn bfoster](https://img.shields.io/badge/LinkedIn-getfoster-blue?style=for-the-badge)](https://www.linkedin.com/in/getfoster/) <br>
{% for item in site.data.toc %}
<h3>{{item.title}}</h3>
<ul>
{% for entry in item.subfolderitems %}
<li>{{entry.page}}</li>
{% endfor %}
</ul>
{% endfor %}
