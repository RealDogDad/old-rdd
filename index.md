---
layout: default
title: Brandan Foster Portfolio
---

### Brandan Foster | Software Developer | Lifelong Learner

 {{site.time}}
 {% if site.time <= {{site.date.me.info.gradDate}}%}
 {{site.date.me.info.postGrad}}
 {% elsif %}
 {{site.date.me.info.preGrad}}
 {% endif %}

[A little about me](about.md)   | [What I've learned](cv.md) | Notes<br>
{% for item in site.data.toc.toc %}
<h3>{{item.title}}</h3>
<ul>
{% for entry in item.subfolderitems %}
<li>{{entry.page}}</li>
{% endfor %}
</ul>
{% endfor %}
<br>
[![Email bfoster](https://img.shields.io/badge/Email-brandan@getfoster.net-green?style=for-the-badge)](mailto:brandan@getfoster.net)
[![Website bfoster](https://img.shields.io/badge/Website-./getfoster-yellow?style=for-the-badge)](https:www.getfoster.net/hire-me)
[![Twitter realdogdad](https://img.shields.io/badge/Twitter-@real_dog_dad-9cf?style=for-the-badge)](https://twitter.com/real_dog_dad)
[![LinkedIn bfoster](https://img.shields.io/badge/LinkedIn-getfoster-blue?style=for-the-badge)](https://www.linkedin.com/in/getfoster/) <br>

