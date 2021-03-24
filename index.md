---
layout: page
title: "Brandan Foster | Applications Developer"
permalink: index.md
---

# Brandan Foster | Software Developer | Lifelong Learner

# [A little about me](about.md)   | [What I've learned](cv.md) | [Notes](/pages/notes.md) | [Projects](/pages/projects.md)
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