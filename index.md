# Brandan Foster | Software Developer | Lifelong Learner

# [A little about me](/pages/about.md)   | [What I've learned](/pages/cv.md) | [Notes](/pages/notes.md) | [Projects](/pages/projects.md)
<br>
{{site.data.me.info.preGrad}}
{{site.data.me.info.blurb}}
[Awards](/pages/awards.md)
<br>
[![Email bfoster](https://img.shields.io/badge/Email-brandan@getfoster.net-greeb?style=for-the-badge)](mailto:brandan@getfoster.net)
[![Website bfoster](https://img.shields.io/badge/Website-./getfoster-yellow?style=for-the-badge)](https:www.getfoster.net/hire-me)
[![Twitter realdogdad](https://img.shields.io/badge/Twitter-@real_dog_dad-9cf?style=for-the-badge)](https://twitter.com/real_dog_dad)
[![LinkedIn bfoster](https://img.shields.io/badge/LinkedIn-getfoster-blue?style=for-the-badge)](https://www.linkedin.com/in/getfoster/)
<br>
{% for item in site.data.devSkills.toc %}
<h3>{{item.title}}</h3>
<ul>
{% for entry in item.subfolderitems %}
<li>{{entry.page}}</li>
{% endfor %}
</ul>
{% endfor %}