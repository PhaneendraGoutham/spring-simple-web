- install maven
- cd to simple-web
<pre>
mvn install
</pre>

- cd to directory where you want to create your web app
<pre>

mvn archetype:generate -DarchetypeGroupId=sk.openhouse.archetypes -DarchetypeArtifactId=simple-web -DarchetypeVersion=1.0 -DgroupId=&lt;your.group.id&gt; -DartifactId=&lt;your-artifact-id&gt;
</pre>
- cd to newly created directory
<pre>
mvn jetty:run
<pre>
