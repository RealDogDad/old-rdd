---
layout: page
title: "Brandan Foster | Applications Developer"
permalink: /home/
---

# Brandan Foster | Software Developer | Lifelong Learner

# [A little about me](about.md)   | [What I've learned](cv.md) | [Notes](/pages/notes.md) | [Projects](/pages/projects.md)
<br>
{{site.data.me.info.preGrad}}
{{site.data.me.info.blurb}}
<br>
<h3>{{site.data.devSkills.item.title}}</h3>
<ul>
{% for entry in site.data.devSkills.skills.item.subfolderitems %}
<li>{{entry.skill}}</li>
{% endfor %}
</ul>
{% endfor %}