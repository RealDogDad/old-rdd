# Brandan Foster | Software Developer | Lifelong Learner

# [A little about me](/pages/about.md)   | [What I've learned](/pages/cv.md) | [Notes](/pages/notes.md) | [Projects](/pages/projects.md) | [Test Table](/pages/dataTableTest.md)
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