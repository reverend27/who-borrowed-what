<html>
    <head>
        <title>WhoBorrowedWhat.com</title>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div id="pageBody">
            <h1>Welcome to WhoBorrowedWhat?.com</h1>
            <p>A lifting costume must be worn and shall be of a one - piece full length lifting suit of one - ply stretch material without any patches, padding or division into panels by means of seams not necessary in the manufacture of the costume. Any seams, false or otherwise, that in the opinion of the Technical Committee, Jury, or in their absence the referees are incorporated into the costume purely as a form of reinforcement or bracing, shall invalidate the costume from being used in the competition.</p>

            <div id="navElements" class="dialog">
                <h2>Navigation</h2>
                <ul>
                    <li class="controller">
                        <g:link controller="login">Login</g:link>
                    </li>
                    <li class="controller">
                        <g:link controller="user" action="create">Create a new account</g:link>
                    </li>
                </ul>
            </div>
            <div id="controllerList" class="dialog">
                <h2>Available Controllers:</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
                    </g:each>
                </ul>
            </div>
        </div>
    </body>
</html>
