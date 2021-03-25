# Brandan Foster | Software Developer | Lifelong Learner
[![Email bfoster](https://img.shields.io/badge/Email-brandan@getfoster.net-8B89CC?style=for-the-badge&logo=ProtonMail)](mailto:brandan@getfoster.net)
[![LinkedIn bfoster](https://img.shields.io/badge/LinkedIn-getfoster-0A66C2?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/getfoster/)
[![GitHub RealDogDad](https://img.shields.io/badge/GitHub-@RealDogDad-181717?style=for-the-badge&logo=github)](https://www.linkedin.com/in/getfoster/)
<br>
# [A little about me](/pages/about.md)   | [What I've learned](/pages/cv.md) | [Awards](/pages/awards.md) | [Projects](/pages/projects.md)
<br>
{{site.data.me.info.preGrad}}
{{site.data.me.info.blurb}}

<br>

{% for item in site.data.devSkills.toc %}
<h3>{{item.title}}</h3>
<ul>
{% for entry in item.subfolderitems %}
<li>{{entry.page}}</li>
{% endfor %}
</ul>
{% endfor %}
<!-- [![Twitter realdogdad](https://img.shields.io/badge/Twitter-@real_dog_dad-9cf?style=for-the-badge&logo=twitter)](https://twitter.com/real_dog_dad)-->