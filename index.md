### This is where the YAML value should appear.
{{site.data.test.fname}}
{{site.data.test.lname}} IS
{{site.data.test.handle}}
<ul>
{% for item in site.data.account.profile %}
<li>[{{item.name}}]({{item.link}})</li>
{% endfor %}
</ul>
[A Real Link](https://en.wikipedia.org/wiki/Jacob%27s_Ladder)
