---
layout: documentation
title: For internal use only
---

[&laquo; Back to index](index.html)
# For internal use only

Table of Contents:

* [FusiontablesControl](#FusiontablesControl)
* [GameClient](#GameClient)
* [MediaStore](#MediaStore)
* [PhoneStatus](#PhoneStatus)
* [Twitter](#Twitter)
* [Voting](#Voting)
* [YandexTranslate](#YandexTranslate)

## FusiontablesControl  {#FusiontablesControl}

Appinventor fusiontables control.

 This version has been migrated from the Fusiontables SQL API to the Fusiontables V1.0 API.
 And migrated yet again to the V2.0 API (6/29/2016 -- JIS)

 See <a href="https://developers.google.com/fusiontables/">https://developers.google.com/fusiontables/</a>

 The main change occurs in the way API requests are authorized.  This version uses
 OAuth 2.0 and makes use of OAuth2Helper. The helper uses the Google AccountManager
 to acquire an access token that must be attached as the OAuth header in all
 Fusiontable Http requests.

 Before a Fusiontable request can be made, the app must acquire an OAuth token.
 This may involve the user logging in to their Gmail account (or not if they are already
 logged in) and then being prompted to give the app permission to access the user's fusion
 tables.

 Permission takes the form of an access token (called authToken), which must be
 transmitted to the Fusiontables service as part of all Http requests.



### Properties  {#FusiontablesControl-Properties}

{:.properties}

{:id="FusiontablesControl.ApiKey" .text} *ApiKey*
: Getter for the API key.

{:id="FusiontablesControl.KeyFile" .text} *KeyFile*
: Specifies the path of the private key file.  This key file is used to get access to the FusionTables API.

{:id="FusiontablesControl.LoadingDialogMessage" .text} *LoadingDialogMessage*
: Getter for the loading dialog's message.

{:id="FusiontablesControl.Query" .text} *Query*
: The query to send to the Fusion Tables API. <p>For legal query formats and examples, see the <a href="https://developers.google.com/fusiontables/docs/v2/getting_started" target="_blank">Fusion Tables API v2.0 reference manual</a>.</p> <p>Note that you do not need to worry about UTF-encoding the query. But you do need to make sure it follows the syntax described in the reference manual, which means that things like capitalization for names of columns matters, and that single quotes need to be used around column names if there are spaces in them.</p>

{:id="FusiontablesControl.ServiceAccountEmail" .text} *ServiceAccountEmail*
: Property for the service account email to use when using service authentication.

{:id="FusiontablesControl.ShowLoadingDialog" .boolean} *ShowLoadingDialog*
: Getter for the loading dialog's visibility.

{:id="FusiontablesControl.UseServiceAuthentication" .boolean} *UseServiceAuthentication*
: Property to determine whether to use service authentication or user authentication. When this is
 checked, service authentication is used.

### Events  {#FusiontablesControl-Events}

{:.events}

{:id="FusiontablesControl.GotResult"} GotResult(*result*{:.text})
: Indicates that the Fusion Tables query has finished processing, with a result.  The result of the query will generally be returned in CSV format, and can be converted to list format using the "list from csv table" or "list from csv row" blocks.

### Methods  {#FusiontablesControl-Methods}

{:.methods}

{:id="FusiontablesControl.ForgetLogin" class="method"} <i/> ForgetLogin()
: Forget end-users login credentials. Has no effect on service authentication

{:id="FusiontablesControl.GetRows" class="method"} <i/> GetRows(*tableId*{:.text},*columns*{:.text})
: Gets all the rows from a specified fusion table. The tableId field is the id of therequired fusion table. The columns field is a comma-separeted list of the columns to retrieve.

{:id="FusiontablesControl.GetRowsWithConditions" class="method"} <i/> GetRowsWithConditions(*tableId*{:.text},*columns*{:.text},*conditions*{:.text})
: Gets all the rows from a fusion table that meet certain conditions. The tableId field isthe id of the required fusion table. The columns field is a comma-separeted list of the columns toretrieve. The conditions field specifies what rows to retrieve from the table, for example the rows in whicha particular column value is not null.

{:id="FusiontablesControl.InsertRow" class="method"} <i/> InsertRow(*tableId*{:.text},*columns*{:.text},*values*{:.text})
: Inserts a row into the specified fusion table. The tableId field is the id of thefusion table. The columns is a comma-separated list of the columns to insert values into. The values field specifies what values to insert into each column.

{:id="FusiontablesControl.SendQuery" class="method"} <i/> SendQuery()
: Calls QueryProcessor to execute the API request asynchronously, if
 the user has already authenticated with the Fusiontables service.

## GameClient  {#GameClient}

GameClient provides a way for AppInventor applications to
 communicate with online game servers. This allows users to create
 games that are coordinated and managed in the cloud.

 Most communication is done by sending keyed messages back and
 forth between the client and the server in the form of YailLists.
 The server and game client can then switch on the keys and perform
 more complex operations on the data. In addition, game servers can
 implement a library of server commands that can perform complex
 functions on the server and send back responses that are converted
 into YailLists and sent back to the component. For more
 information about server commands, consult the game server code
 at http://code.google.com/p/app-inventor-for-android/

 Games instances are uniquely determined by a game id and an
 instance id. In general, each App Inventor program should have
 its own game id. Then, when running different instances of that
 program, new instance ides should be used. Players are
 represented uniquely by the email address registered to their
 phones.

 All call functions perform POSTs to a web server. Upon successful
 completion of these POST requests, FunctionCompleted will be
 triggered with the function name as an argument. If the post
 fails, WebServiceError will trigger with the function name and the
 error message as arguments. These calls allow for application
 creators to deal with web service failures and keep track of the
 success or failure of their operations. The only exception to this
 is when the return value from the server has the incorrect game id
 or instance id. In this case, the response is completely ignored
 and neither of these events will trigger.



### Properties  {#GameClient-Properties}

{:.properties}

{:id="GameClient.GameId" .text .ro} *GameId*
: Returns a string indicating the game name for this application.
 The same game ID can have one or more game instances.

{:id="GameClient.InstanceId" .text .ro .bo} *InstanceId*
: Returns the game instance id.  Taken together, the game ID and
 the instance ID uniquely identify the game.

{:id="GameClient.InvitedInstances" .list .ro .bo} *InvitedInstances*
: Returns the set of game instances to which this player has been
 invited but has not yet joined.  To ensure current values are
 returned, first invoke [`GetInstanceLists`](#GameClient.GetInstanceLists).

{:id="GameClient.JoinedInstances" .list .ro .bo} *JoinedInstances*
: Returns the set of game instances in which this player is
 participating.  To ensure current values are returned, first
 invoke [`GetInstanceLists`](#GameClient.GetInstanceLists).

{:id="GameClient.Leader" .text .ro .bo} *Leader*
: Returns the game's leader. At any time, each game instance has
 only one leader, but the leader may change with time.
 Initially, the leader is the game instance creator. Application
 writers determine special properties of the leader. The leader
 value is updated each time a successful communication is made
 with the server.

{:id="GameClient.Players" .list .ro .bo} *Players*
: Returns the current set of players for this game instance. Each
 player is designated by an email address, which is a string. The
 list of players is updated each time a successful communication
 is made with the game server.

{:id="GameClient.PublicInstances" .list .ro .bo} *PublicInstances*
: Returns the set of game instances that have been marked public.
 To ensure current values are returned, first
 invoke [`GetInstanceLists`](#GameClient.GetInstanceLists).

{:id="GameClient.ServiceURL" .text .wo .do} *ServiceURL*
: Set the URL of the game server.

{:id="GameClient.ServiceUrl" .text .ro .bo} *ServiceUrl*
: The URL of the game server.

{:id="GameClient.UserEmailAddress" .text .bo} *UserEmailAddress*
: Changes the player of this game by changing the email address
 used to communicate with the server.

 This should only be used during development. Games should not
 allow players to set their own email address.

### Events  {#GameClient-Events}

{:.events}

{:id="GameClient.FunctionCompleted"} FunctionCompleted(*functionName*{:.text})
: Indicates that a server request from a function call has
 completed. This can be used to control a polling loop or
 otherwise respond to server request completions.

{:id="GameClient.GotMessage"} GotMessage(*type*{:.text},*sender*{:.text},*contents*{:.list})
: Indicates that a GetMessages call received a message. This could
 be invoked multiple times for a single call to GetMessages.

{:id="GameClient.Info"} Info(*message*{:.text})
: Indicates that something has occurred which the player should be
 somehow informed of.

{:id="GameClient.InstanceIdChanged"} InstanceIdChanged(*instanceId*{:.text})
: Indicates that InstanceId has changed due to the creation of a
 new instance or setting the InstanceId.

{:id="GameClient.Invited"} Invited(*instanceId*{:.text})
: Indicates a user has been invited to this game instance by
 another player.

{:id="GameClient.NewInstanceMade"} NewInstanceMade(*instanceId*{:.text})
: Indicates this game instance was created as specified via
 MakeNewInstance. The creating player is automatically the leader
 of the instance and the InstanceId property has already been set
 to this new instance.

{:id="GameClient.NewLeader"} NewLeader(*playerId*{:.text})
: Indicates this game instance has a new leader. This could happen
 in response to a call to SetLeader or by the side effects of a
 server command performed by any player in the game.

 Since the current leader is sent back with every server
 response, NewLeader can trigger after making any server call.

{:id="GameClient.PlayerJoined"} PlayerJoined(*playerId*{:.text})
: Indicates that a player has joined this game instance.

{:id="GameClient.PlayerLeft"} PlayerLeft(*playerId*{:.text})
: Indicates that a player has left this game instance.

{:id="GameClient.ServerCommandFailure"} ServerCommandFailure(*command*{:.text},*arguments*{:.list})
: Indicates that an attempt to complete a server command failed on
 the server.

{:id="GameClient.ServerCommandSuccess"} ServerCommandSuccess(*command*{:.text},*response*{:.list})
: Indicates that a ServerCommand completed.

{:id="GameClient.UserEmailAddressSet"} UserEmailAddressSet(*emailAddress*{:.text})
: Indicates that the user email address property has been
 successfully set. This event should be used to initialize
 any web service functions.

 This separate event was required because the email address was
 unable to be first fetched from the the UI thread without
 causing programs to hang. GameClient will now start fetching
 the user email address in its constructor and trigger this event
 when it finishes.

{:id="GameClient.WebServiceError"} WebServiceError(*functionName*{:.text},*message*{:.text})
: Indicates that the attempt to communicate with the web service
 resulted in an error.

### Methods  {#GameClient-Methods}

{:.methods}

{:id="GameClient.GetInstanceLists" class="method"} <i/> GetInstanceLists()
: Updates the current InstancesJoined and InstancesInvited lists.

 If the player has been invited to new instances an Invited
 event will be raised for each new instance.

{:id="GameClient.GetMessages" class="method"} <i/> GetMessages(*type*{:.text},*count*{:.number})
: Retrieves messages of the specified type.

 Requests that only messages which have not been seen during
 the current session are returned. Messages will be processed
 in chronological order with the oldest first, however, only
 the count newest messages will be retrieved. This means that
 one could "miss out" on some messages if they request less than
 the number of messages created since the last request for
 that message type.

 Setting type to the empty string will fetch all message types.
 Even though those message types were not specifically requested,
 their most recent message time will be updated. This keeps
 players from receiving the same message again if they later
 request the specific message type.

 Note that the message receive times are not updated until after
 the messages are actually received. Thus, if multiple message
 requests are made before the previous ones return, they could
 send stale time values and thus receive the same messages more
 than once. To avoid this, application creators should wait for
 the get messages function to return before calling it again.

{:id="GameClient.Invite" class="method"} <i/> Invite(*playerEmail*{:.text})
: Invites a player to this game instance.

 Players implicitly accept invitations when they join games by
 setting the instance id in their GameClient.

 Invitations remain active as long as the game instance exists.

{:id="GameClient.LeaveInstance" class="method"} <i/> LeaveInstance()
: Requests to leave the current instance. If the player is the
 current leader, the lead will be passed to another player.

 If there are no other players left in the instance after the
 current player leaves, the instance will become unjoinable.

 Upon successful completion of this command, the instance
 lists will be updated and InstanceId will be set back to the
 empty string.

 Note that while this call does clear the leader and player
 lists, no NewLeader or PlayerLeft events are raised.

{:id="GameClient.MakeNewInstance" class="method"} <i/> MakeNewInstance(*instanceId*{:.text},*makePublic*{:.boolean})
: Creates a new game instance.  The instance has a unique
 instanceId, and the leader is the player who created it. The
 player that creates the game automatically joins it without
 being sent an invitation.

 The actual instance id could differ from the instanceId
 specified because the game server will enforce uniqueness. The
 actual instanceId will be provided to AppInventor when a
 NewInstanceMade event triggers upon successful completion of
 this server request.

{:id="GameClient.SendMessage" class="method"} <i/> SendMessage(*type*{:.text},*recipients*{:.list},*contents*{:.list})
: Creates a new message and sends it to the stated recipients.

{:id="GameClient.ServerCommand" class="method"} <i/> ServerCommand(*command*{:.text},*arguments*{:.list})
: Submits a command to the game server. Server commands are
 custom actions that are performed on the server. The arguments
 required and return value of a server command depend on its
 implementation.

 For more information about server commands, consult the game
 server code at:
 http://code.google.com/p/app-inventor-for-android/

{:id="GameClient.SetInstance" class="method"} <i/> SetInstance(*instanceId*{:.text})
: Specifies the game instance id.  Taken together, the game ID and
 the instance ID uniquely identify the game.

{:id="GameClient.SetLeader" class="method"} <i/> SetLeader(*playerEmail*{:.text})
: Specifies the game's leader. At any time, each game instance
 has only one leader, but the leader may change over time.
 Initially, the leader is the game instance creator. Application
 inventors determine special properties of the leader.

 The leader can only be set by the current leader of the game.

## MediaStore  {#MediaStore}

The MediaStore component communicates with a web service to store media objects. This component
 has a single method that stores a media object in the services blob store, and returns a pointer
 to the object via a url. The accompanying Web service is at (http://ai-mediaservice.appspot.com).

 This component is currently in development, and more functionality will be added.



### Properties  {#MediaStore-Properties}

{:.properties}

{:id="MediaStore.ServiceURL" .text} *ServiceURL*
: Specifies the URL of the  Web service.
 The default value is the App Inventor MediaStore service running on App Engine.

### Events  {#MediaStore-Events}

{:.events}

{:id="MediaStore.MediaStored"} MediaStored(*url*{:.text})
: Indicates that a MediaStored server request has succeeded.

{:id="MediaStore.WebServiceError"} WebServiceError(*message*{:.text})
: Indicates that the communication with the Web service signaled an error

### Methods  {#MediaStore-Methods}

{:.methods}

{:id="MediaStore.PostMedia" class="method"} <i/> PostMedia(*mediafile*{:.text})
: Asks the Web service to store the given media file.

## PhoneStatus  {#PhoneStatus}

Component for obtaining Phone Information. Currently supports
 obtaining the IP Address of the phone and whether or not it is
 connected via a WiFi connection.



### Properties  {#PhoneStatus-Properties}

{:.properties}

{:id="PhoneStatus.WebRTC" .boolean} *WebRTC*
: If True we are using WebRTC to talk to the server.

### Events  {#PhoneStatus-Events}

{:.events}

{:id="PhoneStatus.OnSettings"} OnSettings()
: This event is fired when the "settings" menu item is selected (only available in the
 Companion App, defined in ReplForm.java).

### Methods  {#PhoneStatus-Methods}

{:.methods}

{:id="PhoneStatus.GetInstaller" class="method returns text"} <i/> GetInstaller()
: Return the app that installed us

{:id="PhoneStatus.GetVersionName" class="method returns text"} <i/> GetVersionName()
: GetVersionName -- Return the package versionName

 We use this to determine whether or not the Companion is compatible
 with the current version of App Inventor. We provide this to the
 Rendezvous server. When in "WebRTC" mode, the MIT App Inventor
 client gets this value from the Rendezvous server (the older HTTPD
 approach has its own "_getversion" URL which is used to do this, but
 we cannot use that approach when using WebRTC, and the Rendezvous server
 approach we support here is actually better because it avoid a round
 trip between the client and the Companion...

{:id="PhoneStatus.GetWifiIpAddress" class="method returns text"} <i/> GetWifiIpAddress()
: Returns the IP address of the phone in the form of a String

{:id="PhoneStatus.InstallationId" class="method returns text"} <i/> InstallationId()
: Return the ACRA Installation ID

{:id="PhoneStatus.SdkLevel" class="method returns number"} <i/> SdkLevel()
: SdkLevel -- Return the current Android SDK Level

 We use this to send the Rendezvous server our API leve which it
 can then log for statistics (so we know when we can deprecate an
 older version of Android because usage is low enough).

{:id="PhoneStatus.SetPopup" class="method"} <i/> SetPopup(*page*{:.text})
: Set the content of the Pop-Up page used for the new legacy connection

{:id="PhoneStatus.doFault" class="method"} <i/> doFault()
: Causes an Exception, used to debug exception processing.

{:id="PhoneStatus.installURL" class="method"} <i/> installURL(*url*{:.text})
: Downloads the URL and installs it as an Android Package via the installed browser

{:id="PhoneStatus.isConnected" class="method returns boolean"} <i/> isConnected()
: Returns TRUE if the phone is on Wifi, FALSE otherwise

{:id="PhoneStatus.isDirect" class="method returns boolean"} <i/> isDirect()
: Returns true if we are running in the emulator or USB Connection

{:id="PhoneStatus.setAssetsLoaded" class="method"} <i/> setAssetsLoaded()
: Declare that we have loaded our initial assets and other assets should come from the sdcard

{:id="PhoneStatus.setHmacSeedReturnCode" class="method returns text"} <i/> setHmacSeedReturnCode(*seed*{:.text},*rendezvousServer*{:.text})
: Establish the secret seed for HOTP generation. Return the SHA1 of the provided seed, this will be used to contact the rendezvous server. Note: This code also starts the connection negotiation process if we are using WebRTC. This is a bit of a kludge...

{:id="PhoneStatus.shutdown" class="method"} <i/> shutdown()
: Really Exit the Application

{:id="PhoneStatus.startHTTPD" class="method"} <i/> startHTTPD(*secure*{:.boolean})
: Start the internal AppInvHTTPD to listen for incoming forms. FOR REPL USE ONLY!

{:id="PhoneStatus.startWebRTC" class="method"} <i/> startWebRTC(*rendezvousServer*{:.text},*iceServers*{:.text})
: Start the WebRTC engine

## Twitter  {#Twitter}

A non-visible component that enables communication with [Twitter](https://twitter.com). Once a
 user has logged into their Twitter account (and the authorization has been confirmed successful
 by the [`IsAuthorized`](#Twitter.IsAuthorized) event), many more operations are available:

 - Searching Twitter for tweets or labels ([`SearchTwitter`](#Twitter.SearchTwitter))
 - Sending a Tweet ([`Tweet`](#Twitter.Tweet))
 - Sending a Tweet with an Image ([`TweetWithImage`](#Twitter.TweetWithImage))
 - Directing a message to a specific user ([`DirectMessage`](#Twitter.DirectMessage))
 - Receiving the most recent messages directed to the logged-in user ([`RequestDirectMessages`](#Twitter.RequestDirectMessages))
 - Following a specific user ([`Follow`](#Twitter.Follow))
 - Ceasing to follow a specific user ([`StopFollowing`](#Twitter.StopFollowing))
 - Getting a list of users following the logged-in user ([`RequestFollowers`](#Twitter.RequestFollowers))
 - Getting the most recent messages of users followed by the logged-in user ([`RequestFriendTimeline`](#Twitter.RequestFriendTimeline))
 - Getting the most recent mentions of the logged-in user ([`RequestMentions`](#Twitter.RequestMentions))

 You must obtain a Consumer Key and Consumer Secret for Twitter authorization specific to your
 app from http://twitter.com/oauth_clients/new



### Properties  {#Twitter-Properties}

{:.properties}

{:id="Twitter.ConsumerKey" .text} *ConsumerKey*
: The consumer key to be used when authorizing with Twitter via OAuth.

{:id="Twitter.ConsumerSecret" .text} *ConsumerSecret*
: The consumer secret to be used when authorizing with Twitter via OAuth.

{:id="Twitter.DirectMessages" .list .ro .bo} *DirectMessages*
: This property contains a list of the most recent messages mentioning the logged-in user.
 Initially, the list is empty. To set it, the program must:

   1. Call the [`Authorize`](#Twitter.Authorize) method.
   2. Wait for the [`IsAuthorized`](#Twitter.IsAuthorized) event.
   3. Call the [`RequestDirectMessages`](#Twitter.RequestDirectMessages) method.
   4, Wait for the [`DirectMessagesReceived`](#Twitter.DirectMessagesReceived) event.

   The value of this property will then be set to the list of direct messages retrieved (and
 maintain that value until any subsequent call to [`RequestDirectMessages`](#Twitter.RequestDirectMessages)).

{:id="Twitter.Followers" .list .ro .bo} *Followers*
: This property contains a list of the followers of the logged-in user. Initially, the list is
 empty. To set it, the program must:

   1. Call the [`Authorize`](#Twitter.Authorize) method.
   2. Wait for the [`IsAuthorized`](#Twitter.IsAuthorized) event.
   3. Call the [`RequestFollowers`](#Twitter.RequestFollowers) method.
   4. Wait for the [`FollowersReceived`](#Twitter.FollowersReceived) event.

   The value of this property will then be set to the list of followers (and maintain its value
 until any subsequent call to [`RequestFollowers`](#Twitter.RequestFollowers)).

{:id="Twitter.FriendTimeline" .list .ro .bo} *FriendTimeline*
: This property contains the 20 most recent messages of users being followed. Initially, the
 list is empty. To set it, the program must:
 
   1. Call the [`Authorize`](#Twitter.Authorize) method.
   2. Wait for the [`IsAuthorized`](#Twitter.IsAuthorized) event.
   3. Specify users to follow with one or more calls to the [`Follow`](#Twitter.Follow) method.
   4. Call the [`RequestFriendTimeline`](#Twitter.RequestFriendTimeline)  method.
   5. Wait for the [`FriendTimelineReceived`](#Twitter.FriendTimelineReceived) event.

   The value of this property will then be set to the list of messages (and maintain its value
 until any subsequent call to [`RequestFriendTimeline`](#Twitter.RequestFriendTimeline).

{:id="Twitter.Mentions" .list .ro .bo} *Mentions*
: This property contains a list of mentions of the logged-in user. Initially, the list is empty.
 To set it, the program must:
 
   1. Call the [`Authorize`](#Twitter.Authorize) method.
   2. Wait for the [`IsAuthorized`](#Twitter.IsAuthorized) event.
   3. Call the [`RequestMentions`](#Twitter.RequestMentions) method.
   4. Wait for the [`MentionsReceived`](#Twitter.MentionsReceived) event.
 
   The value of this property will then be set to the list of mentions (and will maintain its
 value until any subsequent calls to [`RequestMentions`](#Twitter.RequestMentions)).

{:id="Twitter.SearchResults" .list .ro .bo} *SearchResults*
: This property, which is initially empty, is set to a list of search results after the program:

   1. Calls the [`SearchTwitter`](#Twitter.SearchTwitter) method.
   2. Waits for the [`SearchSuccessful`](#Twitter.SearchSuccessful) event.

   The value of the property will then be the same as the parameter to
 [`SearchSuccessful`](#Twitter.SearchSuccessful). Note that it is not necessary to call the [`Authorize`](#Twitter.Authorize)
 method before calling [`SearchTwitter`](#Twitter.SearchTwitter).

{:id="Twitter.Username" .text .ro .bo} *Username*
: The user name of the authorized user. Empty if there is no authorized user.

### Events  {#Twitter-Events}

{:.events}

{:id="Twitter.DirectMessagesReceived"} DirectMessagesReceived(*messages*{:.list})
: This event is raised when the recent messages requested through
 [`RequestDirectMessages`](#Twitter.RequestDirectMessages) have been retrieved. A list of the messages can then be found
 in the `messages`{:.variable.block} parameter or the [`DirectMessages`](#Twitter.DirectMessages) property.

{:id="Twitter.FollowersReceived"} FollowersReceived(*followers2*{:.list})
: This event is raised when all of the followers of the logged-in user requested through
 [`RequestFollowers`](#Twitter.RequestFollowers) have been retrieved. A list of the followers can then be found in
 the `followers`{:.variable.block} parameter or the [`Followers`](#Twitter.Followers) property.

{:id="Twitter.FriendTimelineReceived"} FriendTimelineReceived(*timeline*{:.list})
: This event is raised when the messages requested through [`RequestFriendTimeline`](#Twitter.RequestFriendTimeline) have
 been retrieved. The `timeline`{:.variable.block} parameter and the [`FriendTimeline`](#Twitter.FriendTimeline)
 property will contain a list of lists, where each sub-list contains a status update of the
 form (username message).

{:id="Twitter.IsAuthorized"} IsAuthorized()
: This event is raised after the program calls [`Authorize`](#Twitter.Authorize) if the authorization was
 successful. It is also called after a call to [`CheckAuthorized`](#Twitter.CheckAuthorized) if we already have a
 valid access token. After this event has been raised, any other method for this component can
 be called.

{:id="Twitter.MentionsReceived"} MentionsReceived(*mentions*{:.list})
: This event is raised when the mentions of the logged-in user requested through
 [`RequestMentions`](#Twitter.RequestMentions) have been retrieved. A list of the mentions can then be found in
 the `mentions`{:.variable.block} parameter or the [`Mentions`](#Twitter.Mentions) property.

{:id="Twitter.SearchSuccessful"} SearchSuccessful(*searchResults*{:.list})
: This event is raised when the results of the search requested through
 [`SearchTwitter`](#Twitter.SearchTwitter) have been retrieved. A list of the results can then be found in
 the `results`{:.variable.block} parameter or the [`SearchResults`](#Twitter.SearchResults) property.

### Methods  {#Twitter-Methods}

{:.methods}

{:id="Twitter.Authorize" class="method"} <i/> Authorize()
: Redirects user to login to Twitter via the Web browser using the OAuth protocol if we don't already have authorization.

{:id="Twitter.CheckAuthorized" class="method"} <i/> CheckAuthorized()
: Check whether we already have access, and if so, causes the [`IsAuthorized`](#Twitter.IsAuthorized) event
 handler to be called.

{:id="Twitter.DeAuthorize" class="method"} <i/> DeAuthorize()
: Removes Twitter authorization from this running app instance.

{:id="Twitter.DirectMessage" class="method"} <i/> DirectMessage(*user*{:.text},*message*{:.text})
: This sends a direct (private) message to the specified user. The message will be trimmed if it
 exceeds 160 characters.

   __Requirements__: This should only be called after the [`IsAuthorized`](#Twitter.IsAuthorized) event has
 been raised, indicating that the user has successfully logged in to Twitter.

{:id="Twitter.Follow" class="method"} <i/> Follow(*user*{:.text})
: Starts following a user.

{:id="Twitter.RequestDirectMessages" class="method"} <i/> RequestDirectMessages()
: Requests the 20 most recent direct messages sent to the logged-in user. When the messages have
 been retrieved, the system will raise the [`DirectMessagesReceived`](#Twitter.DirectMessagesReceived) event and set
 the [`DirectMessages`](#Twitter.DirectMessages) property to the list of messages.

   __Requirements__: This should only be called after the [`IsAuthorized`](#Twitter.IsAuthorized) event has
 been raised, indicating that the user has successfully logged in to Twitter.

{:id="Twitter.RequestFollowers" class="method"} <i/> RequestFollowers()
: Gets who is following you.

{:id="Twitter.RequestFriendTimeline" class="method"} <i/> RequestFriendTimeline()
: Gets the most recent 20 messages in the user's timeline.

{:id="Twitter.RequestMentions" class="method"} <i/> RequestMentions()
: Requests the 20 most recent mentions of the logged-in user. When the mentions have been
 retrieved, the system will raise the [`MentionsReceived`](#Twitter.MentionsReceived) event and set the
 [`Mentions`](#Twitter.Mentions) property to the list of mentions.

   __Requirements__: This should only be called after the [`IsAuthorized`](#Twitter.IsAuthorized) event has
 been raised, indicating that the user has successfully logged in to Twitter.

{:id="Twitter.SearchTwitter" class="method"} <i/> SearchTwitter(*query*{:.text})
: This searches Twitter for the given String query.

   __Requirements__: This should only be called after the [`IsAuthorized`](#Twitter.IsAuthorized) event has
 been raised, indicating that the user has successfully logged in to Twitter.

{:id="Twitter.StopFollowing" class="method"} <i/> StopFollowing(*user*{:.text})
: Stops following a user.

{:id="Twitter.Tweet" class="method"} <i/> Tweet(*status*{:.text})
: This sends a tweet as the logged-in user with the specified Text, which will be trimmed if it
 exceeds 160 characters.

   __Requirements__: This should only be called after the [`IsAuthorized`](#Twitter.IsAuthorized) event has
 been raised, indicating that the user has successfully logged in to Twitter.

{:id="Twitter.TweetWithImage" class="method"} <i/> TweetWithImage(*status*{:.text},*imagePath*{:.text})
: This sends a tweet as the logged-in user with the specified Text and a path to the image to be
 uploaded, which will be trimmed if it exceeds 160 characters. If an image is not found or
 invalid, the update will not be sent.

   __Requirements__: This should only be called after the [`IsAuthorized`](#Twitter.IsAuthorized) event has
 been raised, indicating that the user has successfully logged in to Twitter.

## Voting  {#Voting}

The Voting component communicates with a Web service to retrieve a ballot
 and send back users' votes.

 <p>The application should call the method <code>RequestBallot</code>, usually
 in the <code>Initialize</code> event handler, in order to get the ballot
 question and options from the Web service (specified by the
 <code>ServiceURL</code> property).  Depending on the response from the
 Web service, the system will raise one of the following three events:
 <ol>
 <li> <code>GotBallot</code>, indicating that the ballot question and options
      were retrieved and the properties <code>BallotQuestion</code> and
      <code>BallotOptions</code> have been set.</li>
 <li> <code>NoOpenPoll</code>, indicating that no ballot question is
      available.</li>
 <li> <code>WebServiceError</code>, indicating that the service did not
      provide a legal response and providing an error messages.</li>
 </ol></p>

 <p>After getting the ballot, the application should allow the user to make
 a choice from among <code>BallotOptions</code> and set the property
 <code>UserChoice</code> to that choice.  The application should also set
 <code>UserId</code> to specify which user is voting.</p>

 <p>Once the application has set <code>UserChoice</code> and
 <code>UserId</code>, the application can call <code>SendBallot</code> to
 send this information to the Web service.  If the service successfully
 receives the vote, the event <code>GotBallotConfirmation</code> will be
 raised.  Otherwise, the event <code>WebServiceError</code> will be raised
 with the appropriate error message.</p>



### Properties  {#Voting-Properties}

{:.properties}

{:id="Voting.BallotOptions" .list .ro .bo} *BallotOptions*
: The list of choices to vote.

{:id="Voting.BallotQuestion" .text .ro .bo} *BallotQuestion*
: The question to be voted on.

{:id="Voting.ServiceURL" .text} *ServiceURL*
: Set the URL of the Voting Service

{:id="Voting.UserChoice" .text .bo} *UserChoice*
: Set the choice to select when sending the vote.

{:id="Voting.UserEmailAddress" .text .ro .bo} *UserEmailAddress*
: Returns the registered email address, as a string, for this
 device's user.

{:id="Voting.UserId" .text .bo} *UserId*
: Set an Id to be sent to the Web server along with the vote.

### Events  {#Voting-Events}

{:.events}

{:id="Voting.GotBallot"} GotBallot()
: Event indicating that a ballot was received from the Web service.

{:id="Voting.GotBallotConfirmation"} GotBallotConfirmation()
: Event confirming that the Voting service received the ballot.

{:id="Voting.NoOpenPoll"} NoOpenPoll()
: Event indicating that the service has no open poll.

{:id="Voting.WebServiceError"} WebServiceError(*message*{:.text})
: Event indicating that the communication with the Web service resulted in
 an error.

### Methods  {#Voting-Methods}

{:.methods}

{:id="Voting.RequestBallot" class="method"} <i/> RequestBallot()
: Send a request ballot command to the Voting server.

{:id="Voting.SendBallot" class="method"} <i/> SendBallot()
: Send a ballot to the Web Voting server.  The userId and the choice are
 specified by the UserId and UserChoice properties.

## YandexTranslate  {#YandexTranslate}

Use this component to translate words and sentences between different languages. This component
 needs Internet access, as it will request translations to the Yandex.Translate service.
 Specify the source and target language in the form source-target using two letter language codes.
 So "en-es" will translate from English to Spanish while "es-ru" will translate from Spanish to
 Russian. If you leave out the source language, the service will attempt to detect the source
 language. So providing just "es" will attempt to detect the source language and translate it
 to Spanish.

 This component is powered by the Yandex translation service. See
 http://api.yandex.com/translate/ for more information, including the list of available languages
 and the meanings of the language codes and status codes.

 **Note:** Translation happens asynchronously in the background. When the translation is complete,
 the [`GotTranslation`](#YandexTranslate.GotTranslation) event is triggered.



### Properties  {#YandexTranslate-Properties}

{:.properties}

{:id="YandexTranslate.ApiKey" .text .wo} *ApiKey*
: The Yandex API Key to use. If set to DEFAULT the platform default key (if any)
 will be used. Otherwise should be set to a valid API key which can be obtained
 from https://tech.yandex.com/translate/. If the platform doesn't have a default
 key and one isn't provided here, an error will be raised.

### Events  {#YandexTranslate-Events}

{:.events}

{:id="YandexTranslate.GotTranslation"} GotTranslation(*responseCode*{:.text},*translation*{:.text})
: Event indicating that a request has finished and has returned data (translation).

### Methods  {#YandexTranslate-Methods}

{:.methods}

{:id="YandexTranslate.RequestTranslation" class="method"} <i/> RequestTranslation(*languageToTranslateTo*{:.text},*textToTranslate*{:.text})
: By providing a target language to translate to (for instance, 'es' for Spanish, 'en' for
 English, or 'ru' for Russian), and a word or sentence to translate, this method will request
 a translation to the Yandex.Translate service. Once the text is translated by the external
 service, the event [`GotTranslation`](#YandexTranslate.GotTranslation) will be executed.

   **Note:** Yandex.Translate will attempt to detect the source language. You can also specify
 prepending it to the language translation, e.g., es-ru will specify Spanish to Russian
 translation.
